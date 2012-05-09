import unitTests.*;
import engine.Engine;

/**
 * Minecraft Clone - Default Package Main.java - Created by bluechill
 * 
 * @version 1.0
 * 
 * Initially Created: Jan 24, 2012
 * Last Updated: Jan 24, 2012
 */

/**
 * @author bluechill
 * @version: 1.0
 * 
 * Initially Created: Jan 24, 2012
 * Last Updated: Jan 24, 2012
 * 
 */
public class Main
{
	/**
	 * @param args Arguments for our program
	 */
	public static void main(String[] args)
	{
		Engine mainEngine = new Engine();
		// TODO Load engine and then execute it, then execute the game.

		// Unit Test 1
		// mainEngine.pushState(new Test1());

		// Unit Test 2
		mainEngine.pushState(new Test2());

		// Unit Test 3
		// mainEngine.pushState(new Test3());
		
		// Unit Test 4
		// mainEngine.pushState(new Test4());

		// Unit Test 5
		// mainEngine.pushState(new Test5());

		// Unit Test 6
		// mainEngine.pushState(new Test6());
		
		// Unit Test 7
		//mainEngine.pushState(new Test7());
		
		// Unit Test 8
		//mainEngine.pushState(new Test8());

		mainEngine.terminateEngine();
	}

}
