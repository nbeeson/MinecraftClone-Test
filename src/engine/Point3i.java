/**
 * Minecraft Clone - engine
 * Point3i.java - Created by bluechill
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
 * Point3i
 * 
 * Another "Point" class. This class is mainly used for sizes which are better
 * suited to integers not floats.
 */
public class Point3i
{
	private int	xCoord;
	private int	yCoord;
	private int	zCoord;

	/**
	 * "Fake" constructor. Used to construct a Point3i from another Point3f
	 * 
	 * @param floatVersion The Point3f to convert
	 */
	public Point3i(Point3f floatVersion)
	{
		this(	(int) floatVersion.getX(),
				(int) floatVersion.getY(),
				(int) floatVersion.getZ());
	}

	/**
	 * The real constructor. Constructs a Point3i from the specified integers.
	 * 
	 * @param xCoord The x coordinate of the Point3i
	 * @param yCoord The y coordinate of the Point3i
	 * @param zCoord The z coordinate of the Point3i
	 */
	public Point3i(int xCoord, int yCoord, int zCoord)
	{
		this.xCoord = xCoord;
		this.yCoord = yCoord;
		this.zCoord = zCoord;
	}

	/**
	 * What is the x coordinate of the Point3i?
	 * 
	 * @return The xCoord of the Point3i
	 */
	public int getX()
	{
		return this.xCoord;
	}

	/**
	 * What is the y coordinate of the Point3i?
	 * 
	 * @return The yCoord of the Point3i
	 */
	public int getY()
	{
		return this.yCoord;
	}

	/**
	 * What is the z coordinate of the Point3i?
	 * 
	 * @return The zCoord of the Point3i
	 */
	public int getZ()
	{
		return this.zCoord;
	}

	/**
	 * Set the x coordinate of the Point3i.
	 * 
	 * @param xCoord The new x coordinate of the Point3i
	 */
	public void setX(int xCoord)
	{
		this.xCoord = xCoord;
	}

	/**
	 * Set the y coordinate of the Point3i
	 * 
	 * @param yCoord The new y coordinate of the Point3i
	 */
	public void setY(int yCoord)
	{
		this.yCoord = yCoord;
	}

	/**
	 * Set the z coordinate of the Point3i
	 * 
	 * @param zCoord The new y coordinate of the Point3i
	 */
	public void setZ(int zCoord)
	{
		this.zCoord = zCoord;
	}

	/**
	 * Set both coordinates of the Point3i at once.
	 * 
	 * @param xCoord The new x coordinate of the Point3i
	 * @param yCoord The new y coordinate of the Point3i
	 * @param zCoord The new z coordinate of the Point3i
	 */
	public void set(int xCoord, int yCoord, int zCoord)
	{
		this.xCoord = xCoord;
		this.yCoord = yCoord;
		this.zCoord = zCoord;
	}

	/**
	 * Set this Point3i's coordinates to those of another Point3i
	 * 
	 * @param otherOne The Point3i to take the new values from
	 */
	public void set(Point3i otherOne)
	{
		this.xCoord = otherOne.getX();
		this.yCoord = otherOne.getY();
		this.zCoord = otherOne.getZ();
	}

	/**
	 * add - adds another Point3i value's to this one
	 * 
	 * @param otherOne The Point3i to use to add to this one
	 */
	public void add(Point3i otherOne)
	{
		this.xCoord += otherOne.getX();
		this.yCoord += otherOne.getY();
		this.zCoord += otherOne.getZ();
	}

	/**
	 * subtract - subtracts another Point3i value's to this one (this Point3i -
	 * other Point3i)
	 * 
	 * @param otherOne The Point3i to use to subtract from this one
	 */
	public void subtract(Point3i otherOne)
	{
		this.xCoord -= otherOne.getX();
		this.yCoord -= otherOne.getY();
		this.zCoord -= otherOne.getZ();
	}

	/**
	 * divide - divides another Point3i to this one
	 * 
	 * @param otherOne The Point3i to use to divide this one
	 */
	public void divide(Point3i otherOne)
	{
		this.xCoord /= otherOne.getX();
		this.yCoord /= otherOne.getY();
		this.zCoord /= otherOne.getZ();
	}

	/**
	 * multiply - multiply another Point3i's values to this one
	 * 
	 * @param otherOne The Point3i to use to multiply this one
	 */
	public void multiply(Point3i otherOne)
	{
		this.xCoord *= otherOne.getX();
		this.yCoord *= otherOne.getY();
		this.zCoord *= otherOne.getZ();
	}
}
