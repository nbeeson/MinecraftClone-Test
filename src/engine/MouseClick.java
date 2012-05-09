/**
 * Minecraft Clone - engine MouseClick.java - Created by bluechill
 * 
 * @version 1.0
 * 
 * Initially Created: Jan 25, 2012
 * Last Updated: Jan 26, 2012
 */
package engine;

/**
 * @author bluechill
 * @version: 1.0
 * 
 * Initially Created: Jan 25, 2012
 * Last Updated: Jan 26, 2012
 * 
 * MouseClick
 * 
 * Used for handling mouse clicks - A data class really
 */
public class MouseClick
{
	private int		button;
	private boolean	pressed;

	/**
	 * MouseClick - The constructor for the mouse click class
	 * 
	 * @param button The button pressed/released
	 * @param pressed Whether the button was pressed or released
	 */
	public MouseClick(final int button, final boolean pressed)
	{
		this.button = button;
		this.pressed = pressed;
	}

	/**
	 * getButton - Get which button was pressed/released
	 * 
	 * @return The button that was pressed/released
	 */
	public int getButton()
	{
		return this.button;
	}

	/**
	 * getPressed - Was the button pressed or released?
	 * 
	 * @return Whether the button was pressed or released
	 */
	public boolean getPressed()
	{
		return this.pressed;
	}
}
