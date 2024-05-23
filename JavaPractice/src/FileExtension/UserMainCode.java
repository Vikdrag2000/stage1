package FileExtension;

public class UserMainCode {

	public static String fileIdentifier(String s) {
		
		int a = s.lastIndexOf(".");
		String str = s.substring(a+1);
		return str;
				
	}
}
