package MaxSubsString;

public class UserMainCode {

	public static String extractMax(String sent,String del) {
		String arr[] = sent.split(del);
		String ret="";
		for(String i: arr) {
			if(i.length()>ret.length()) {
				ret=i;
			}
		}
		return ret;
	}
}
