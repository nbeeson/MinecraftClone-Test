/**
 * Minecraft Clone - engine
 * Point2i.java - Created by bluechill
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
 * Point2i
 * 
 * Another "Point" class. This class is mainly used for sizes which are better
 * suited to integers not floats.
 */
public class Point2i
{
	private int	xCoord;
	private int	yCoord;

	/**
	 * "Fake" constructor. Used to construct a Point2i from another Point2f
	 * 
	 * @param floatVersion The Point2f to convert
	 */
	public Point2i(Point2f floatVersion)
	{
		this((int) floatVersion.getX(), (int) floatVersion.getY());
	}

	/**
	 * The real constructor. Constructs a Point2i from the specified integers.
	 * 
	 * @param xCoord The x coordinate of the Point2i
	 * @param yCoord The y coordinate of the Point2i
	 */
	public Point2i(int xCoord, int yCoord)
	{
		this.xCoord = xCoord;
		this.yCoord = yCoord;
	}

	/**
	 * What is the x coordinate of the Point2i?
	 * 
	 * @return The xCoord of the Point2i
	 */
	public int getX()
	{
		return this.xCoord;
	}

	/**
	 * What is the y coordinate of the Point2i?
	 * 
	 * @return The yCoord of the Point2i
	 */
	public int getY()
	{
		return this.yCoord;
	}

	/**
	 * Set the x coordinate of the Point2i.
	 * 
	 * @param xCoord The new x coordinate of the Point2i
	 */
	public void setX(int xCoord)
	{
		this.xCoord = xCoord;
	}

	/**
	 * Set the y coordinate of the Point2i
	 * 
	 * @param yCoord The new y coordinate of the Point2i
	 */
	public void setY(int yCoord)
	{
		this.yCoord = yCoord;
	}

	/**
	 * Set both coordinates of the point2i at once.
	 * 
	 * @param xCoord The new x coordinate of the Point2i
	 * @param yCoord The new y coordinate of the Point2i
	 */
	public void set(int xCoord, int yCoord)
	{
		this.xCoord = xCoord;
		this.yCoord = yCoord;
	}

	/**
	 * Set this point2i's coordinates to those of another Point2i
	 * 
	 * @param otherOne The Point2i to take the new values from
	 */
	public void set(Point2i otherOne)
	{
		this.xCoord = otherOne.getX();
		this.yCoord = otherOne.getY();
	}

	/**
	 * add - adds another Point2i value's to this one
	 * 
	 * @param otherOne The Point2i to use to add to this one
	 */
	public void add(Point2i otherOne)
	{
		this.xCoord += otherOne.getX();
		this.yCoord += otherOne.getY();
	}

	/**
	 * subtract - subtracts another Point2i value's to this one (this Point2i -
	 * other Point2i)
	 * 
	 * @param otherOne The Point2i to use to subtract from this one
	 */
	public void subtract(Point2i otherOne)
	{
		this.xCoord -= otherOne.getX();
		this.yCoord -= otherOne.getY();
	}

	/**
	 * divide - divides another Point2i to this one
	 * 
	 * @param otherOne The Point2i to use to divide this one
	 */
	public void divide(Point2i otherOne)
	{
		this.xCoord /= otherOne.getX();
		this.yCoord /= otherOne.getY();
	}

	/**
	 * multiply - multiply another Point2i's values to this one
	 * 
	 * @param otherOne The Point2i to use to multiply this one
	 */
	public void multiply(Point2i otherOne)
	{
		this.xCoord *= otherOne.getX();
		this.yCoord *= otherOne.getY();
	}
}
