package ValidateTime;
import java.util.regex.*;
public class UserMainCode {

	public static int validateTime(String s) {
		String regex = "(1[012]|0[1-9]):[0-5][0-9] [aApP][mM]";
		if(s.matches(regex)) {
			return 1;
		}
		return -1;
	}
}
