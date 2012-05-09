/**
 * Minecraft Clone - engine Point2f.java - Created by bluechill
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
 * Point2f
 * 
 * "Point" object defined with floats. If you want to keep track of points on
 * screen, use this class.
 */
public class Point2f
{
	private float	xCoord;
	private float	yCoord;

	/**
	 * Construct a Point2f from a Point2i
	 * 
	 * @param intVersion The Point2i to convert to a float
	 */
	public Point2f(Point2i intVersion)
	{
		this(intVersion.getX(), intVersion.getY());
	}

	/**
	 * Construct a Point2f from another Point2f
	 * 
	 * @param point2f The Point2f to copy from
	 */
	public Point2f(Point2f point2f)
	{
		this(point2f.xCoord, point2f.yCoord);
	}

	/**
	 * Construct a Point2f from the specified floats
	 * 
	 * @param xCoord The x coordinate of the Point2f
	 * @param yCoord The y coordinate of the Point2f
	 */
	public Point2f(float xCoord, float yCoord)
	{
		this.xCoord = xCoord;
		this.yCoord = yCoord;
	}

	/**
	 * What is the x coordinate of the Point2f?
	 * 
	 * @return The xCoord of the Point2f
	 */
	public float getX()
	{
		return this.xCoord;
	}

	/**
	 * What is the y coordinate of the Point2f?
	 * 
	 * @return The yCoord of the Point2f
	 */
	public float getY()
	{
		return this.yCoord;
	}

	/**
	 * Set the x coordinate of this Point2f
	 * 
	 * @param xCoord The new x coordinate to set
	 */
	public void setX(float xCoord)
	{
		this.xCoord = xCoord;
	}

	/**
	 * Set the y coordinate of this Point2f
	 * 
	 * @param yCoord The new y coordinate to set
	 */
	public void setY(float yCoord)
	{
		this.yCoord = yCoord;
	}

	/**
	 * Set both coordinates of this Point2f
	 * 
	 * @param xCoord The new x coordinate of this Point2f
	 * @param yCoord The new y coordinate of this Point2f
	 */
	public void set(float xCoord, float yCoord)
	{
		this.xCoord = xCoord;
		this.yCoord = yCoord;
	}

	/**
	 * Set the coordinates of this Point2f to the values of the otherOne.
	 * 
	 * @param otherOne The Point2f to take coordinates from
	 */
	public void set(Point2f otherOne)
	{
		this.xCoord = otherOne.getX();
		this.yCoord = otherOne.getY();
	}

	/**
	 * add - adds another Point2f value's to this one
	 * 
	 * @param otherOne The Point2f to use to add to this one
	 */
	public void add(Point2f otherOne)
	{
		this.xCoord += otherOne.getX();
		this.yCoord += otherOne.getY();
	}

	/**
	 * subtract - subtracts another Point2f value's to this one (this Point2f -
	 * other Point2f)
	 * 
	 * @param otherOne The Point2f to use to subtract from this one
	 */
	public void subtract(Point2f otherOne)
	{
		this.xCoord -= otherOne.getX();
		this.yCoord -= otherOne.getY();
	}

	/**
	 * divide - divides another Point2f to this one
	 * 
	 * @param otherOne The Point2f to use to divide this one
	 */
	public void divide(Point2f otherOne)
	{
		this.xCoord /= otherOne.getX();
		this.yCoord /= otherOne.getY();
	}

	/**
	 * multiply - multiply another Point2f's values to this one
	 * 
	 * @param otherOne The Point2f to use to multiply this one
	 */
	public void multiply(Point2f otherOne)
	{
		this.xCoord *= otherOne.getX();
		this.yCoord *= otherOne.getY();
	}
}