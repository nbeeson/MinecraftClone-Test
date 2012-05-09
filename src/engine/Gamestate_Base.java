/**
 * Minecraft Clone - engine GameState.java - Created by bluechill
 * 
 * @version 1.0
 * 
 * Initially Created: Jan 24, 2012
 * Last Updated: Jan 26, 2012
 */
package engine;

/**
 * @author bluechill
 * @version: 1.0
 * Initially Created: Jan 24, 2012
 * Last Updated: Jan 26, 2012
 * 
 * Gamestate_Base
 * 
 * This is what defines a "state." The game engine uses states to show
 * content, as in, they are "screens" so to speak. All states must
 * inherit from this class.
 */
public abstract class Gamestate_Base extends EObject
{
	/**
	 * All logic calculations should be done in this method. This is called as
	 * often as possible
	 */
	@Override
	abstract public void performLogic();

	/**
	 * All rendering operations should be done in this method. This is called
	 * once per frame.
	 */
	@Override
	abstract public void render();

	/**
	 * Called every time a key is pressed and in turn, released. You should
	 * probably use keyPressed and keyReleased for player movement, hint hint.
	 * 
	 * @param key The key pressed and then released
	 */
	abstract public void onKey(Key key);

	/**
	 * Called every time a key is pressed down.
	 * 
	 * @param key The key pressed
	 */
	public void keyPressed(Key key)
	{ /* STUB Base class doesn't need this method */
	}

	/**
	 * Called every time a key is released that was previously pressed down.
	 * 
	 * @param key The key released
	 */
	public void keyReleased(Key key)
	{ /* STUB Base class doesn't need this method */
	}

	/**
	 * Called every time a mouse button is pressed & in turn, released.
	 * 
	 * @param click The info for the click
	 */
	abstract public void onMouseButton(MouseClick click);

	/**
	 * Called when a mouse button is pressed down.
	 * 
	 * @param click The info for the pressing of a mouse button
	 */
	public void mousePressed(MouseClick click)
	{ /* STUB Base class doesn't need this method */
	}

	/**
	 * Called when a mouse button that was pressed down, is released.
	 * 
	 * @param click The info for the releasing of a mouse button
	 */
	public void mouseReleased(MouseClick click)
	{ /* STUB Base class doesn't need this method */
	}

	/**
	 * Called when the mouse is moved.
	 * 
	 * @param coordinates The coordinates of the mouse in points.
	 */
	abstract public void onMouseMotion(Point2i coordinates);
}