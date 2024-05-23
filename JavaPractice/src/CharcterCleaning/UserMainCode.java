package CharcterCleaning;

public class UserMainCode {

	public static String removeCharacter(String s, char c) {
		String ch = Character.toString(c);
		String ret = s.replace(ch, "");
		return ret;
	}
}
