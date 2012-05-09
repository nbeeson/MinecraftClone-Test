/**
 * Minecraft Clone - engine Key.java - Created by bluechill
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
 * Key
 * 
 * For key presses
 */
public class Key
{
	private int				key;
	private boolean			pressed;

	/**
	 * Here is a list of all the keys for the engine. Just check if the key is
	 * Key.KEY_0 for example to check if it's the 0 key.
	 * 
	 * TODO: Figure out a better looking way of doing suppress warnings or get
	 * rid of the warnings without all the comments :P
	 */
	public static final int	CHAR_NONE			= 0;
	@SuppressWarnings ("javadoc")
	public static final int	EVENT_SIZE			= 18;
	@SuppressWarnings ("javadoc")
	public static final int	KEY_0				= 11;
	@SuppressWarnings ("javadoc")
	public static final int	KEY_1				= 2;
	@SuppressWarnings ("javadoc")
	public static final int	KEY_2				= 3;
	@SuppressWarnings ("javadoc")
	public static final int	KEY_3				= 4;
	@SuppressWarnings ("javadoc")
	public static final int	KEY_4				= 5;
	@SuppressWarnings ("javadoc")
	public static final int	KEY_5				= 6;
	@SuppressWarnings ("javadoc")
	public static final int	KEY_6				= 7;
	@SuppressWarnings ("javadoc")
	public static final int	KEY_7				= 8;
	@SuppressWarnings ("javadoc")
	public static final int	KEY_8				= 9;
	@SuppressWarnings ("javadoc")
	public static final int	KEY_9				= 10;
	@SuppressWarnings ("javadoc")
	public static final int	KEY_A				= 30;
	@SuppressWarnings ("javadoc")
	public static final int	KEY_ADD				= 78;
	@SuppressWarnings ("javadoc")
	public static final int	KEY_APOSTROPHE		= 40;
	@SuppressWarnings ("javadoc")
	public static final int	KEY_APPS			= 221;
	@SuppressWarnings ("javadoc")
	public static final int	KEY_AT				= 145;
	@SuppressWarnings ("javadoc")
	public static final int	KEY_AX				= 150;
	@SuppressWarnings ("javadoc")
	public static final int	KEY_B				= 48;
	@SuppressWarnings ("javadoc")
	public static final int	KEY_BACK			= 14;
	@SuppressWarnings ("javadoc")
	public static final int	KEY_BACKSLASH		= 43;
	@SuppressWarnings ("javadoc")
	public static final int	KEY_C				= 46;
	@SuppressWarnings ("javadoc")
	public static final int	KEY_CAPITAL			= 58;
	@SuppressWarnings ("javadoc")
	public static final int	KEY_CIRCUMFLEX		= 144;
	@SuppressWarnings ("javadoc")
	public static final int	KEY_COLON			= 146;
	@SuppressWarnings ("javadoc")
	public static final int	KEY_COMMA			= 51;
	@SuppressWarnings ("javadoc")
	public static final int	KEY_CONVERT			= 121;
	@SuppressWarnings ("javadoc")
	public static final int	KEY_D				= 32;
	@SuppressWarnings ("javadoc")
	public static final int	KEY_DECIMAL			= 83;
	@SuppressWarnings ("javadoc")
	public static final int	KEY_DELETE			= 211;
	@SuppressWarnings ("javadoc")
	public static final int	KEY_DIVIDE			= 181;
	@SuppressWarnings ("javadoc")
	public static final int	KEY_DOWN			= 208;
	@SuppressWarnings ("javadoc")
	public static final int	KEY_E				= 18;
	@SuppressWarnings ("javadoc")
	public static final int	KEY_END				= 207;
	@SuppressWarnings ("javadoc")
	public static final int	KEY_EQUALS			= 13;
	@SuppressWarnings ("javadoc")
	public static final int	KEY_ESCAPE			= 1;
	@SuppressWarnings ("javadoc")
	public static final int	KEY_F				= 33;
	@SuppressWarnings ("javadoc")
	public static final int	KEY_F1				= 59;
	@SuppressWarnings ("javadoc")
	public static final int	KEY_F10				= 68;
	@SuppressWarnings ("javadoc")
	public static final int	KEY_F11				= 87;
	@SuppressWarnings ("javadoc")
	public static final int	KEY_F12				= 88;
	@SuppressWarnings ("javadoc")
	public static final int	KEY_F13				= 100;
	@SuppressWarnings ("javadoc")
	public static final int	KEY_F14				= 101;
	@SuppressWarnings ("javadoc")
	public static final int	KEY_F15				= 102;
	@SuppressWarnings ("javadoc")
	public static final int	KEY_F2				= 60;
	@SuppressWarnings ("javadoc")
	public static final int	KEY_F3				= 61;
	@SuppressWarnings ("javadoc")
	public static final int	KEY_F4				= 62;
	@SuppressWarnings ("javadoc")
	public static final int	KEY_F5				= 63;
	@SuppressWarnings ("javadoc")
	public static final int	KEY_F6				= 64;
	@SuppressWarnings ("javadoc")
	public static final int	KEY_F7				= 65;
	@SuppressWarnings ("javadoc")
	public static final int	KEY_F8				= 66;
	@SuppressWarnings ("javadoc")
	public static final int	KEY_F9				= 67;
	@SuppressWarnings ("javadoc")
	public static final int	KEY_G				= 34;
	@SuppressWarnings ("javadoc")
	public static final int	KEY_GRAVE			= 41;
	@SuppressWarnings ("javadoc")
	public static final int	KEY_H				= 35;
	@SuppressWarnings ("javadoc")
	public static final int	KEY_HOME			= 199;
	@SuppressWarnings ("javadoc")
	public static final int	KEY_I				= 23;
	@SuppressWarnings ("javadoc")
	public static final int	KEY_INSERT			= 210;
	@SuppressWarnings ("javadoc")
	public static final int	KEY_J				= 36;
	@SuppressWarnings ("javadoc")
	public static final int	KEY_K				= 37;
	@SuppressWarnings ("javadoc")
	public static final int	KEY_KANA			= 112;
	@SuppressWarnings ("javadoc")
	public static final int	KEY_KANJI			= 148;
	@SuppressWarnings ("javadoc")
	public static final int	KEY_L				= 38;
	@SuppressWarnings ("javadoc")
	public static final int	KEY_LBRACKET		= 26;
	@SuppressWarnings ("javadoc")
	public static final int	KEY_LCONTROL		= 29;
	@SuppressWarnings ("javadoc")
	public static final int	KEY_LEFT			= 203;
	@SuppressWarnings ("javadoc")
	public static final int	KEY_LMENU			= 56;
	@SuppressWarnings ("javadoc")
	public static final int	KEY_LMETA			= 219;
	@SuppressWarnings ("javadoc")
	public static final int	KEY_LSHIFT			= 42;
	@SuppressWarnings ("javadoc")
	public static final int	KEY_LWIN			= 219;
	@SuppressWarnings ("javadoc")
	public static final int	KEY_M				= 50;
	@SuppressWarnings ("javadoc")
	public static final int	KEY_MINUS			= 12;
	@SuppressWarnings ("javadoc")
	public static final int	KEY_MULTIPLY		= 55;
	@SuppressWarnings ("javadoc")
	public static final int	KEY_N				= 49;
	@SuppressWarnings ("javadoc")
	public static final int	KEY_NEXT			= 209;
	@SuppressWarnings ("javadoc")
	public static final int	KEY_NOCONVERT		= 123;
	@SuppressWarnings ("javadoc")
	public static final int	KEY_NONE			= 0;
	@SuppressWarnings ("javadoc")
	public static final int	KEY_NUMLOCK			= 69;
	@SuppressWarnings ("javadoc")
	public static final int	KEY_NUMPAD0			= 82;
	@SuppressWarnings ("javadoc")
	public static final int	KEY_NUMPAD1			= 79;
	@SuppressWarnings ("javadoc")
	public static final int	KEY_NUMPAD2			= 80;
	@SuppressWarnings ("javadoc")
	public static final int	KEY_NUMPAD3			= 81;
	@SuppressWarnings ("javadoc")
	public static final int	KEY_NUMPAD4			= 75;
	@SuppressWarnings ("javadoc")
	public static final int	KEY_NUMPAD5			= 76;
	@SuppressWarnings ("javadoc")
	public static final int	KEY_NUMPAD6			= 77;
	@SuppressWarnings ("javadoc")
	public static final int	KEY_NUMPAD7			= 71;
	@SuppressWarnings ("javadoc")
	public static final int	KEY_NUMPAD8			= 72;
	@SuppressWarnings ("javadoc")
	public static final int	KEY_NUMPAD9			= 73;
	@SuppressWarnings ("javadoc")
	public static final int	KEY_NUMPADCOMMA		= 179;
	@SuppressWarnings ("javadoc")
	public static final int	KEY_NUMPADENTER		= 156;
	@SuppressWarnings ("javadoc")
	public static final int	KEY_NUMPADEQUALS	= 141;
	@SuppressWarnings ("javadoc")
	public static final int	KEY_O				= 24;
	@SuppressWarnings ("javadoc")
	public static final int	KEY_P				= 25;
	@SuppressWarnings ("javadoc")
	public static final int	KEY_PAUSE			= 197;
	@SuppressWarnings ("javadoc")
	public static final int	KEY_PERIOD			= 52;
	@SuppressWarnings ("javadoc")
	public static final int	KEY_POWER			= 222;
	@SuppressWarnings ("javadoc")
	public static final int	KEY_PRIOR			= 201;
	@SuppressWarnings ("javadoc")
	public static final int	KEY_Q				= 16;
	@SuppressWarnings ("javadoc")
	public static final int	KEY_R				= 19;
	@SuppressWarnings ("javadoc")
	public static final int	KEY_RBRACKET		= 27;
	@SuppressWarnings ("javadoc")
	public static final int	KEY_RCONTROL		= 157;
	@SuppressWarnings ("javadoc")
	public static final int	KEY_RETURN			= 28;
	@SuppressWarnings ("javadoc")
	public static final int	KEY_RIGHT			= 205;
	@SuppressWarnings ("javadoc")
	public static final int	KEY_RMENU			= 184;
	@SuppressWarnings ("javadoc")
	public static final int	KEY_RMETA			= 220;
	@SuppressWarnings ("javadoc")
	public static final int	KEY_RSHIFT			= 54;
	@SuppressWarnings ("javadoc")
	public static final int	KEY_RWIN			= 220;
	@SuppressWarnings ("javadoc")
	public static final int	KEY_S				= 31;
	@SuppressWarnings ("javadoc")
	public static final int	KEY_SCROLL			= 70;
	@SuppressWarnings ("javadoc")
	public static final int	KEY_SEMICOLON		= 39;
	@SuppressWarnings ("javadoc")
	public static final int	KEY_SLASH			= 53;
	@SuppressWarnings ("javadoc")
	public static final int	KEY_SLEEP			= 223;
	@SuppressWarnings ("javadoc")
	public static final int	KEY_SPACE			= 57;
	@SuppressWarnings ("javadoc")
	public static final int	KEY_STOP			= 149;
	@SuppressWarnings ("javadoc")
	public static final int	KEY_SUBTRACT		= 74;
	@SuppressWarnings ("javadoc")
	public static final int	KEY_SYSRQ			= 183;
	@SuppressWarnings ("javadoc")
	public static final int	KEY_T				= 20;
	@SuppressWarnings ("javadoc")
	public static final int	KEY_TAB				= 15;
	@SuppressWarnings ("javadoc")
	public static final int	KEY_U				= 22;
	@SuppressWarnings ("javadoc")
	public static final int	KEY_UNDERLINE		= 147;
	@SuppressWarnings ("javadoc")
	public static final int	KEY_UNLABELED		= 151;
	@SuppressWarnings ("javadoc")
	public static final int	KEY_UP				= 200;
	@SuppressWarnings ("javadoc")
	public static final int	KEY_V				= 47;
	@SuppressWarnings ("javadoc")
	public static final int	KEY_W				= 17;
	@SuppressWarnings ("javadoc")
	public static final int	KEY_X				= 45;
	@SuppressWarnings ("javadoc")
	public static final int	KEY_Y				= 21;
	@SuppressWarnings ("javadoc")
	public static final int	KEY_YEN				= 125;
	@SuppressWarnings ("javadoc")
	public static final int	KEY_Z				= 44;
	@SuppressWarnings ("javadoc")
	public static final int	KEYBOARD_SIZE		= 256;

	/**
	 * Key - Constructor
	 * 
	 * @param key The key to set this class's key value to
	 * @param pressed Whether the key is pressed or released
	 */
	public Key(final int key, final boolean pressed)
	{
		this.key = key;
		this.pressed = pressed;
	}

	/**
	 * getKey - Get the key currently pressed/released
	 * 
	 * @return The key pressed/released
	 */
	public int getKey()
	{
		return this.key;
	}

	/**
	 * isPressed - Was the key pressed or released?
	 * 
	 * @return Whether the key is pressed
	 */
	public boolean isPressed()
	{
		return this.pressed;
	}
}
