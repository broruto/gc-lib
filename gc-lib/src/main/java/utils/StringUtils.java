package utils;

public class StringUtils {

	public static boolean isEmpty(String s) {
		if(null == s || s.equals("")) {
			return true;
		}
		return false;
	}
	
	public static boolean isNotEmpty(String s) {
		if(null != s && !s.equals("")) {
			return true;
		}
		return false;
	}
}
