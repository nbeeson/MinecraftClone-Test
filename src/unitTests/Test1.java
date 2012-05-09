package unitTests;
import org.lwjgl.opengl.Display;

import engine.Gamestate_Base;
import engine.Key;
import engine.MouseClick;
import engine.Point2i;

/**
 * Minecraft Clone -
 * Test1.java - Created by bluechill
 * 
 * @version 1.0
 * 
 * Initially Created: Jan 27, 2012
 * Last Updated: Jan 27, 2012
 */

/**
 * @author bluechill
 * @version: 1.0
 * Initially Created: Jan 27, 2012
 * Last Updated: Jan 27, 2012
 * 
 */
public class Test1 extends Gamestate_Base
{
	/**
	 * Constructor for the first test
	 */
	public Test1()
	{
		Display.setTitle("Unit Test 1");
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see engine.Gamestate_Base#performLogic()
	 */
	@Override
	public void performLogic()
	{
		// STUB Nothing to do here
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see engine.Gamestate_Base#render()
	 */
	@Override
	public void render()
	{
		// STUB Nothing to do here
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see engine.Gamestate_Base#keyPressed(engine.Key)
	 */
	@Override
	public void keyPressed(Key key)
	{
		System.out.println("Key Pressed: " + key.getKey());
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see engine.Gamestate_Base#keyReleased(engine.Key)
	 */
	@Override
	public void keyReleased(Key key)
	{
		System.out.println("Key Released: " + key.getKey());
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see engine.Gamestate_Base#mousePressed(engine.MouseClick)
	 */
	@Override
	public void mousePressed(MouseClick click)
	{
		System.out.println("Mouse Button Pressed: " + click.getButton());
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see engine.Gamestate_Base#mouseReleased(engine.MouseClick)
	 */
	@Override
	public void mouseReleased(MouseClick click)
	{
		System.out.println("Mouse Button Released: " + click.getButton());
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see engine.Gamestate_Base#onMouseMotion(engine.Point2i)
	 */
	@Override
	public void onMouseMotion(Point2i coordinates)
	{
		System.out.println("Mouse Moved: " + coordinates.getX()
							+ ","
							+ coordinates.getY());
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see engine.Gamestate_Base#onKey(engine.Key)
	 */
	@Override
	public void onKey(Key key)
	{
		// STUB Nothing to do here
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see engine.Gamestate_Base#onMouseButton(engine.MouseClick)
	 */
	@Override
	public void onMouseButton(MouseClick click)
	{
		// STUB Nothing to do here
	}

}
