package unitTests;
import java.io.IOException;

import org.lwjgl.opengl.Display;
import org.lwjgl.opengl.GL11;
import org.newdawn.slick.opengl.Texture;
import org.newdawn.slick.opengl.TextureLoader;
import org.newdawn.slick.util.ResourceLoader;

import engine.EObject;
import engine.Engine;
import engine.Gamestate_Base;
import engine.Key;
import engine.MouseClick;
import engine.Point2i;
import engine.Point3f;

/**
 * Minecraft Clone -
 * Test2.java - Created by bluechill
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
public class Test8 extends Gamestate_Base
{
	private Texture	texture;
	
	private class Cube extends EObject
	{		
		private Point3f direction;
		
		private long time;
		
		public Cube(Point3f position)
		{
			super(position);
			
			direction = new Point3f(0.0f, 0.0f, 0.0f);
			
			time = Engine.getTime();
		}
		
		@Override
		public void render()
		{	
			// Draw a Cube on Screen
			
			GL11.glColor3f(1.0f, 1.0f, 1.0f);
			
			GL11.glTranslatef(this.getPosition().getX(), this.getPosition().getY(), this.getPosition().getZ());
					
			GL11.glBegin(GL11.GL_QUADS);		// Draw The Cube Using quads
			// Quad 1
			GL11.glTexCoord2f(0.0f, 0.0f);
			GL11.glVertex3f(-1.0f, 1.0f, 1.0f);	// Bottom Left Of The Quad (Top)

			GL11.glTexCoord2f(1.0f, 0.0f);
			GL11.glVertex3f(1.0f, 1.0f, 1.0f);	// Bottom Right Of The Quad (Top)

			GL11.glTexCoord2f(1.0f, 1.0f);
			GL11.glVertex3f(1.0f, 1.0f, -1.0f);	// Top Right Of The Quad (Top)
			
			GL11.glTexCoord2f(0.0f, 1.0f);
			GL11.glVertex3f(-1.0f, 1.0f, -1.0f);	// Top Left Of The Quad (Top)

			// Quad 2
			GL11.glTexCoord2f(0.0f, 0.0f);
			GL11.glVertex3f(-1.0f, -1.0f, -1.0f);	// Bottom Left Of The Quad
													// (Bottom)

			GL11.glTexCoord2f(1.0f, 0.0f);
			GL11.glVertex3f(1.0f, -1.0f, -1.0f);	// Bottom Right Of The Quad
													// (Bottom)

			GL11.glTexCoord2f(1.0f, 1.0f);
			GL11.glVertex3f(1.0f, -1.0f, 1.0f);	// Top Right Of The Quad (Bottom)

			GL11.glTexCoord2f(0.0f, 1.0f);
			GL11.glVertex3f(-1.0f, -1.0f, 1.0f);	// Top Left Of The Quad (Bottom)

			// Quad 3
			GL11.glTexCoord2f(0.0f, 0.0f);
			GL11.glVertex3f(-1.0f, 1.0f, -1.0f);	// Bottom Left Of The Quad (Back)

			GL11.glTexCoord2f(1.0f, 0.0f);
			GL11.glVertex3f(1.0f, 1.0f, -1.0f);	// Bottom Right Of The Quad (Back)

			GL11.glTexCoord2f(1.0f, 1.0f);
			GL11.glVertex3f(1.0f, -1.0f, -1.0f);	// Top Right Of The Quad (Back)

			GL11.glTexCoord2f(0.0f, 1.0f);
			GL11.glVertex3f(-1.0f, -1.0f, -1.0f);	// Top Left Of The Quad (Back)

			// Quad 4
			GL11.glTexCoord2f(0.0f, 0.0f);
			GL11.glVertex3f(-1.0f, -1.0f, -1.0f);	// Bottom Left Of The Quad (Left)

			GL11.glTexCoord2f(1.0f, 0.0f);
			GL11.glVertex3f(-1.0f, -1.0f, 1.0f);	// Bottom Right Of The Quad (Left)

			GL11.glTexCoord2f(1.0f, 1.0f);
			GL11.glVertex3f(-1.0f, 1.0f, 1.0f);	// Top Right Of The Quad (Left)

			GL11.glTexCoord2f(0.0f, 1.0f);
			GL11.glVertex3f(-1.0f, 1.0f, -1.0f);	// Top Left Of The Quad (Left)

			// Quad 5
			GL11.glTexCoord2f(0.0f, 0.0f);
			GL11.glVertex3f(1.0f, -1.0f, 1.0f);	// Bottom Left Of The Quad (Right)

			GL11.glTexCoord2f(1.0f, 0.0f);
			GL11.glVertex3f(1.0f, -1.0f, -1.0f);	// Bottom Right Of The Quad (Right)

			GL11.glTexCoord2f(1.0f, 1.0f);
			GL11.glVertex3f(1.0f, 1.0f, -1.0f);	// Top Right Of The Quad (Right)

			GL11.glTexCoord2f(0.0f, 1.0f);
			GL11.glVertex3f(1.0f, 1.0f, 1.0f);	// Top Left Of The Quad (Right)

			// Quad 6
			GL11.glTexCoord2f(0.0f, 0.0f);
			GL11.glVertex3f(-1.0f, -1.0f, 1.0f);	// Bottom Left Of The Quad (Front)

			GL11.glTexCoord2f(1.0f, 0.0f);
			GL11.glVertex3f(1.0f, -1.0f, 1.0f);	// Bottom Right Of The Quad (Front)

			GL11.glTexCoord2f(1.0f, 1.0f);
			GL11.glVertex3f(1.0f, 1.0f, 1.0f);	// Top Right Of The Quad (Front)

			GL11.glTexCoord2f(0.0f, 1.0f);
			GL11.glVertex3f(-1.0f, 1.0f, 1.0f);	// Top Left Of The Quad (Front)

			GL11.glEnd();			// End Drawing The Cube
			
			GL11.glTranslatef(-this.getPosition().getX(), -this.getPosition().getX(), -this.getPosition().getZ());
		}
		
		@Override
		public void performLogic()
		{
			float amountToMove = 0.0f;
			amountToMove += (Engine.getTime() - time);
			amountToMove /= 1000;
						
			this.move(new Point3f(amountToMove * direction.getX(), amountToMove * direction.getY(), amountToMove * direction.getZ()));
			
			System.out.println("Position:" + this.getPosition());
			
			time = Engine.getTime();
		}
		
		public void setMoving(Point3f direction)
		{
			this.direction = direction;
		}
	}
	
	private Cube cube;
		
	/**
	 * 
	 */
	public Test8()
	{
		try
		{
			this.texture = TextureLoader.getTexture("PNG",
													ResourceLoader.getResourceAsStream("units/image.png"));

			System.out.println("Texture loaded: " + this.texture);
			System.out.println(">> Image width: " + this.texture.getImageWidth());
			System.out.println(">> Image height: " + this.texture.getImageHeight());
			System.out.println(">> Texture width: " + this.texture.getTextureWidth());
			System.out.println(">> Texture height: " + this.texture.getTextureHeight());
			System.out.println(">> Texture ID: " + this.texture.getTextureID());
		}
		catch (IOException e)
		{
			e.printStackTrace();

			System.exit(1);
		}

		Display.setTitle("Unit Test 8");
		
		cube = new Cube(new Point3f(0.0f, 0.0f, -5.0f));
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
		cube.performLogic();
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see engine.Gamestate_Base#render()
	 */
	@Override
	public void render()
	{
		cube.render();
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see engine.Gamestate_Base#onKey(engine.Key)
	 */
	@Override
	public void onKey(Key key)
	{
		if ((key.getKey() == Key.KEY_RIGHT || key.getKey() == Key.KEY_D) && key.isPressed())
			this.cube.setMoving(new Point3f(1.0f, 0.0f, 0.0f));
		else if ((key.getKey() == Key.KEY_LEFT || key.getKey() == Key.KEY_A) && key.isPressed())
			this.cube.setMoving(new Point3f(-1.0f, 0.0f, 0.0f));
		else if (((key.getKey() == Key.KEY_RIGHT || key.getKey() == Key.KEY_D) || (key.getKey() == Key.KEY_LEFT || key.getKey() == Key.KEY_A)) && !key.isPressed())
			this.cube.setMoving(new Point3f(0.0f, 0.0f, 0.0f));
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

	/*
	 * (non-Javadoc)
	 * 
	 * @see engine.Gamestate_Base#onMouseMotion(engine.Point2i)
	 */
	@Override
	public void onMouseMotion(Point2i coordinates)
	{
		// STUB Nothing to do here
	}

}
