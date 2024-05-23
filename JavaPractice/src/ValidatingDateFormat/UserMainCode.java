package ValidatingDateFormat;
import java.io.*;
import java.time.*;
import java.time.format.*;
public class UserMainCode {

	public static int validateDate(String s) {
		
		//String regex ="(0[1-9]|[12][0-9]|3[01])/(0[1-9]|1[012])/[0-9]{3}[1-9]";
		
//		if(s.matches(regex)) {
//			return 1;
//		}
//		return -1;.
		
		try {
			DateTimeFormatter dt = DateTimeFormatter.ofPattern("dd/MM/yyyy");
			LocalDate ld = LocalDate.parse(s,dt);
			return 1;
		}catch(Exception e){
			return -1;
		}
	}
}
