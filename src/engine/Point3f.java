/**
 * Minecraft Clone - engine
 * Point3f.java - Created by bluechill
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
 * Point3f
 * 
 * "Point" object defined with floats. If you want to keep track of points on
 * screen, use this class.
 */
public class Point3f
{
	private float	xCoord;
	private float	yCoord;
	private float	zCoord;

	/**
	 * Construct a Point3f from a Point3i
	 * 
	 * @param intVersion The Point3i to convert to a float
	 */
	public Point3f(Point3i intVersion)
	{
		this(intVersion.getX(), intVersion.getY(), intVersion.getZ());
	}

	/**
	 * Construct a Point3f from another Point3f
	 * 
	 * @param Point3f The Point3f to copy from
	 */
	public Point3f(Point3f Point3f)
	{
		this(Point3f.xCoord, Point3f.yCoord, Point3f.zCoord);
	}

	/**
	 * Construct a Point3f from the specified floats
	 * 
	 * @param xCoord The x coordinate of the Point3f
	 * @param yCoord The y coordinate of the Point3f
	 * @param zCoord The z coordinate of the Point3f
	 */
	public Point3f(float xCoord, float yCoord, float zCoord)
	{
		this.xCoord = xCoord;
		this.yCoord = yCoord;
		this.zCoord = zCoord;
	}

	/**
	 * What is the x coordinate of the Point3f?
	 * 
	 * @return The xCoord of the Point3f
	 */
	public float getX()
	{
		return this.xCoord;
	}

	/**
	 * What is the y coordinate of the Point3f?
	 * 
	 * @return The yCoord of the Point3f
	 */
	public float getY()
	{
		return this.yCoord;
	}

	/**
	 * What is the z coordinate of the Point3f?
	 * 
	 * @return The zCoord of the Point3f
	 */
	public float getZ()
	{
		return this.zCoord;
	}

	/**
	 * Set the x coordinate of this Point3f
	 * 
	 * @param xCoord The new x coordinate to set
	 */
	public void setX(float xCoord)
	{
		this.xCoord = xCoord;
	}

	/**
	 * Set the y coordinate of this Point3f
	 * 
	 * @param yCoord The new y coordinate to set
	 */
	public void setY(float yCoord)
	{
		this.yCoord = yCoord;
	}

	/**
	 * Set the z coordinate of this Point3f
	 * 
	 * @param zCoord The new y coordinate to set
	 */
	public void setZ(float zCoord)
	{
		this.zCoord = zCoord;
	}

	/**
	 * Set both coordinates of this Point3f
	 * 
	 * @param xCoord The new x coordinate of this Point3f
	 * @param yCoord The new y coordinate of this Point3f
	 * @param zCoord The new z coordinate of this Point3f
	 */
	public void set(float xCoord, float yCoord, float zCoord)
	{
		this.xCoord = xCoord;
		this.yCoord = yCoord;
		this.zCoord = zCoord;
	}

	/**
	 * Set the coordinates of this Point3f to the values of the otherOne.
	 * 
	 * @param otherOne The Point3f to take coordinates from
	 */
	public void set(Point3f otherOne)
	{
		this.xCoord = otherOne.getX();
		this.yCoord = otherOne.getY();
		this.zCoord = otherOne.getZ();
	}

	/**
	 * add - adds another Point3f value's to this one
	 * 
	 * @param otherOne The Point3f to use to add to this one
	 */
	public void add(Point3f otherOne)
	{
		this.xCoord += otherOne.getX();
		this.yCoord += otherOne.getY();
		this.zCoord += otherOne.getZ();
	}

	/**
	 * subtract - subtracts another Point3f value's to this one (this Point3f -
	 * other Point3f)
	 * 
	 * @param otherOne The Point3f to use to subtract from this one
	 */
	public void subtract(Point3f otherOne)
	{
		this.xCoord -= otherOne.getX();
		this.yCoord -= otherOne.getY();
		this.zCoord -= otherOne.getZ();
	}

	/**
	 * divide - divides another Point3f to this one
	 * 
	 * @param otherOne The Point3f to use to divide this one
	 */
	public void divide(Point3f otherOne)
	{
		this.xCoord /= otherOne.getX();
		this.yCoord /= otherOne.getY();
		this.zCoord /= otherOne.getZ();
	}

	/**
	 * multiply - multiply another Point3f's values to this one
	 * 
	 * @param otherOne The Point3f to use to multiply this one
	 */
	public void multiply(Point3f otherOne)
	{
		this.xCoord *= otherOne.getX();
		this.yCoord *= otherOne.getY();
		this.zCoord *= otherOne.getZ();
	}
}