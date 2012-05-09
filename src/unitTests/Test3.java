package unitTests;
import org.lwjgl.opengl.Display;
import org.lwjgl.opengl.GL11;

import engine.Gamestate_Base;
import engine.Key;
import engine.MouseClick;
import engine.Point2i;

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
public class Test3 extends Gamestate_Base
{
	private float	red					= 0.0f;
	private float	green				= 0.0f;
	private float	blue				= 0.0f;

	private int		whichToIncrement	= 0;

	private boolean	incrementing		= true;

	/**
	 * Constructor for Test3
	 */
	public Test3()
	{
		Display.setTitle("Unit Test 3");
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
		float incrementAmount = 0.016667f;

		switch (this.whichToIncrement)
		{
			case 0:
			{
				if (this.incrementing)
				{
					this.red += incrementAmount;

					if (this.red >= 1.0f)
					{
						this.red = 1.0f;
						this.incrementing = false;
					}
				}
				else
				{
					this.red -= incrementAmount;

					if (this.red <= 0.0f)
					{
						this.red = 0.0f;
						this.whichToIncrement++;
						this.incrementing = true;
					}
				}
				break;
			}
			case 1:
			{
				if (this.incrementing)
				{
					this.blue += incrementAmount;

					if (this.blue >= 1.0f)
					{
						this.blue = 1.0f;
						this.incrementing = false;
					}
				}
				else
				{
					this.blue -= incrementAmount;

					if (this.blue <= 0.0f)
					{
						this.blue = 0.0f;
						this.whichToIncrement++;
						this.incrementing = true;
					}
				}
				break;
			}
			case 2:
			{
				if (this.incrementing)
				{
					this.green += incrementAmount;

					if (this.green >= 1.0f)
					{
						this.green = 1.0f;
						this.incrementing = false;
					}
				}
				else
				{
					this.green -= incrementAmount;

					if (this.green <= 0.0f)
					{
						this.green = 0.0f;
						this.whichToIncrement++;
						this.incrementing = true;
					}
				}
				break;
			}
			case 3:
			{
				if (this.incrementing)
				{
					this.red += incrementAmount;
					this.blue += incrementAmount;

					if (this.red >= 1.0f)
					{
						this.red = 1.0f;
						this.blue = 1.0f;
						this.incrementing = false;
					}
				}
				else
				{
					this.red -= incrementAmount;
					this.blue -= incrementAmount;

					if (this.red <= 0.0f)
					{
						this.red = 0.0f;
						this.blue = 0.0f;

						this.whichToIncrement++;
						this.incrementing = true;
					}
				}
				break;
			}
			case 4:
			{
				if (this.incrementing)
				{
					this.red += incrementAmount;
					this.green += incrementAmount;

					if (this.red >= 1.0f)
					{
						this.red = 1.0f;
						this.green = 1.0f;
						this.incrementing = false;
					}
				}
				else
				{
					this.red -= incrementAmount;
					this.green -= incrementAmount;

					if (this.red <= 0.0f)
					{
						this.red = 0.0f;
						this.green = 0.0f;

						this.whichToIncrement++;
						this.incrementing = true;
					}
				}
				break;
			}
			case 5:
			{
				if (this.incrementing)
				{
					this.blue += incrementAmount;
					this.green += incrementAmount;

					if (this.blue >= 1.0f)
					{
						this.blue = 1.0f;
						this.green = 1.0f;
						this.incrementing = false;
					}
				}
				else
				{
					this.blue -= incrementAmount;
					this.green -= incrementAmount;

					if (this.blue <= 0.0f)
					{
						this.blue = 0.0f;
						this.green = 0.0f;

						this.whichToIncrement++;
						this.incrementing = true;
					}
				}
				break;
			}
			case 6:
			{
				if (this.incrementing)
				{
					this.red += incrementAmount;
					this.blue += incrementAmount;
					this.green += incrementAmount;

					if (this.red >= 1.0f)
					{
						this.red = 1.0f;
						this.blue = 1.0f;
						this.green = 1.0f;
						this.incrementing = false;
					}
				}
				else
				{
					this.red -= incrementAmount;
					this.blue -= incrementAmount;
					this.green -= incrementAmount;

					if (this.red <= 0.0f)
					{
						this.red = 0.0f;
						this.blue = 0.0f;
						this.green = 0.0f;

						this.whichToIncrement = 0;
						this.incrementing = true;
					}
				}
				break;
			}
		}

		// Draw a Quad on Screen

		GL11.glColor3f(this.red, this.green, this.blue);

		GL11.glTranslatef(0.0f, 0.0f, -5.0f);

		GL11.glBegin(GL11.GL_QUADS);
		GL11.glVertex3f(-1.0f, -1.0f, 0.0f);
		GL11.glVertex3f(-1.0f, 1.0f, 0.0f);
		GL11.glVertex3f(1.0f, 1.0f, 0.0f);
		GL11.glVertex3f(1.0f, -1.0f, 0.0f);
		GL11.glEnd();

		GL11.glTranslatef(0.0f, 0.0f, 5.0f);

		GL11.glColor3f(0.0f, 0.0f, 0.0f);
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
