/**
 * Minecraft Clone - engine EObject.java - Created by bluechill
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
 * 
 * Initially Created: Jan 24, 2012
 * Last Updated: Jan 26, 2012
 * 
 * EObject (DroneWars Object)
 * 
 * Every object which is rendered on screen, moved, etc. should inherit from
 * this. Basically everything you create should pretty much inherit from this
 * without exception.
 */
public class EObject
{
	private Point3f	position;

	/**
	 * Create an object at 0,0
	 */
	public EObject()
	{
		this.position = new Point3f(0, 0, 0);
	}

	/**
	 * Create an object at the specified position
	 * 
	 * @param position The position to create the object at
	 */
	public EObject(Point3f position)
	{
		this.position = new Point3f(position);
	}

	/**
	 * Render method. You should override this in all of your objects which need
	 * to be rendered on screen.
	 */
	public void render()
	{
		// STUB Do nothing, this is a base class
	}

	/**
	 * Move an object to the specified coordinates
	 * 
	 * You probably shouldn't need to override this yourself but if you do, make
	 * sure to call super(position)
	 * 
	 * @param point3f The position to move to
	 */
	public void moveTo(Point3f point3f)
	{
		this.position.set(point3f);
	}

	/**
	 * Move an object to the specified coordinates relative to it's previous
	 * coordinates.
	 * 
	 * You probably shouldn't need to override this yourself but if you do, make
	 * sure to call super(positionToMoveBy);
	 * 
	 * @param positionToMoveBy The value to move by
	 */
	public void move(Point3f positionToMoveBy)
	{
		this.position.add(positionToMoveBy);
	}

	/**
	 * Get the object's position
	 * 
	 * @return The position of the object
	 */
	public Point3f getPosition()
	{
		return this.position;
	}

	/**
	 * Override this and perform all logic in this method.
	 */
	public void performLogic()
	{
		// STUB Do nothing, this is a base class, no need for this
	}
}
