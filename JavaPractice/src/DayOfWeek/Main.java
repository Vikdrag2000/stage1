package DayOfWeek;
import java.util.*;
import java.time.*;
import java.time.temporal.*;
import java.time.format.*;
public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		String v = sc.nextLine();
		System.out.println(UserMainCode.getDayOfWeek(v));
	}

}
class UserMainCode{
	
	public static String getDayOfWeek(String s) {
		DateTimeFormatter df = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		LocalDate ld = LocalDate.parse(s,df);
		int a = ld.get(ChronoField.DAY_OF_WEEK);
		switch(a) {
		case 1:
			return "Monday";
		case 2:
			return "Tuesday";
		case 3:
			return "Wednesday";
		case 4:
			return "Thrusday";
		case 5:
			return "Friday";
		case 6:
			return "Saturday";
		default:
			return "Sunday";
			
		}
	}
}