/**
 * Minecraft Clone - engine Engine.java - Created by bluechill
 * 
 * @version 1.0
 * 
 * Initially Created: Jan 24, 2012
 * Last Updated: Jan 26, 2012
 */
package engine;

import java.util.Stack;

import org.lwjgl.LWJGLException;
import org.lwjgl.Sys;
import org.lwjgl.input.Keyboard;
import org.lwjgl.input.Mouse;
import org.lwjgl.opengl.Display;
import org.lwjgl.opengl.DisplayMode;
import org.lwjgl.opengl.GL11;
import org.lwjgl.util.glu.GLU;

/**
 * @author bluechill
 * @version: 1.0
 * 
 * Initially Created: Jan 24, 2012
 * Last Updated: Jan 26, 2012
 */
public class Engine
{
	private Gamestate_Base			currentState;

	private Stack<Gamestate_Base>	states;

	private static Engine			currentEngine;
	
	/**
	 * Engine Constructor
	 */
	public Engine()
	{
		this.states = new Stack<Gamestate_Base>();

		try
		{
			Display.setDisplayMode(new DisplayMode(800, 600));
			Display.create();
			Mouse.create();
			Keyboard.create();
			Keyboard.enableRepeatEvents(true);

			GL11.glEnable(GL11.GL_TEXTURE_2D);

			GL11.glClearColor(0.0f, 0.0f, 0.0f, 0.0f);

			GL11.glEnable(GL11.GL_BLEND);
			GL11.glEnable(GL11.GL_DEPTH_TEST);
			GL11.glBlendFunc(GL11.GL_SRC_ALPHA, GL11.GL_ONE_MINUS_SRC_ALPHA);

			GL11.glMatrixMode(GL11.GL_PROJECTION);
			GL11.glLoadIdentity();
			GLU.gluPerspective(60.0f, 800.0f / 600.0f, 1.0f, 100.0f);
			GL11.glMatrixMode(GL11.GL_MODELVIEW);
		}
		catch (LWJGLException e)
		{
			e.printStackTrace();
			System.exit(0);
		}

		this.currentState = null;

		Engine.setCurrentEngine(this);
	}

	/**
	 * Terminate the Engine. *ALWAYS* Call this or the program will hang at the
	 * end.
	 */
	public void terminateEngine()
	{
		Display.destroy();
	}

	/**
	 * The infinite runLoop(). Calls performLogic for the current state as much
	 * as possible.
	 * 
	 * @return Whether the run loop was successful
	 */
	public int runLoop()
	{
		while (true)
		{
			if (!this.states.empty())
				this.currentState = this.states.peek();
			else
			{
				this.currentState = null;
				break;
			}

			GL11.glClear(GL11.GL_COLOR_BUFFER_BIT | GL11.GL_DEPTH_BUFFER_BIT);

			this.checkKeyboard();
			this.checkMouse();
			
			this.currentState.performLogic();
			this.currentState.render();
			
			Display.update();
			Display.sync(60);

			if (Display.isCloseRequested())
			{
				Display.destroy();
				System.exit(0);
			}
		}

		return 0;
	}

	/**
	 * 
	 */
	public void checkKeyboard()
	{
		for (int keyIndex = Keyboard.getEventKey(); Keyboard.next(); keyIndex = Keyboard.getEventKey())
		{
			boolean wasPressed = Keyboard.isKeyDown(keyIndex);
			
			Key newKeyEvent = new Key(keyIndex, wasPressed);
			
			if (wasPressed)
				this.currentState.keyPressed(newKeyEvent);
			else
				this.currentState.keyReleased(newKeyEvent);

			this.currentState.onKey(newKeyEvent);
		}
	}

	/**
	 * 
	 */
	public void checkMouse()
	{
		for (int mouseButtonIndex = Mouse.getEventButton(); Mouse.next(); mouseButtonIndex = Mouse.getEventButton())
		{
			boolean wasPressed = Mouse.getEventButtonState();

			MouseClick newMouseEvent = new MouseClick(	mouseButtonIndex,
														wasPressed);

			if (wasPressed)
			{
				this.currentState.mousePressed(newMouseEvent);
			}
			else
			{
				this.currentState.mouseReleased(newMouseEvent);
			}

			this.currentState.onMouseButton(newMouseEvent);
		}

		if ((Mouse.getDX() != 0) || (Mouse.getDY() != 0))
		{
			Point2i mousePos = new Point2i(Mouse.getX(), Mouse.getY());

			this.currentState.onMouseMotion(mousePos);
		}
	}

	/**
	 * Used to set the current state of the engine.
	 * 
	 * @param state
	 *            The new state to use
	 */
	public void pushState(Gamestate_Base state)
	{
		this.states.push(state);

		this.runLoop();
	}

	/**
	 * Used to set the current state of the engine.
	 */
	public void popState()
	{
		this.states.pop();
	}

	/**
	 * @param fullscreen Whether to enter or exit fullscreen
	 * @return Whether it was successful at setting the fullscreen value
	 */
	public boolean setFullscreen(final boolean fullscreen)
	{
		if (fullscreen)
		{
			try
			{
				Display.setFullscreen(fullscreen);
				Display.setVSyncEnabled(true);
			}
			catch (LWJGLException e)
			{
				System.err.print(e);

				return false;
			}
		}
		else
		{
			try
			{
				Display.setVSyncEnabled(false);
				Display.setFullscreen(fullscreen);
			}
			catch (LWJGLException e)
			{
				System.err.print(e);

				return false;
			}
		}

		return true;
	}

	/**
	 * @return Current time in miliseconds
	 */
	public static long getTime()
	{
		return (Sys.getTime() * 1000) / Sys.getTimerResolution();
	}

	/**
	 * @return the currentEngine
	 */
	public static Engine getCurrentEngine()
	{
		return Engine.currentEngine;
	}

	/**
	 * @param currentEngine
	 *            the currentEngine to set
	 */
	private static void setCurrentEngine(Engine currentEngine)
	{
		Engine.currentEngine = currentEngine;
	}
}
