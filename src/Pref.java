import java.awt.Color;
import java.util.prefs.Preferences;


public class Pref {
	public static String NODE_ID = "PingMonitorToolByZst123";
	public static String PAUSE_ID = "color_key_pause";
	public static String WEB_ID = "website_key_derp";
	public static String WEB_DEF = "website_key_derp";

	public static String S_ID = "packetsize_k";
	public static String S_DEFAULT = "56";
	public static String c_ID = "count_key";
	public static String c_DEFAULT = "0";



	
	public static void set(String pref_id, String value){
		Preferences prefs = Preferences.userRoot().node(NODE_ID);
			prefs.put(pref_id, value);
	}
	
	public static String get(String id, String def){
		Preferences prefs = Preferences.userRoot().node(NODE_ID);
		return prefs.get(id,def );
		
		
	}
	
	
	
	
}
