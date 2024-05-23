package MonthName;
import java.util.*;
import java.time.*;
import java.time.format.*;
import java.time.temporal.*;

public class MonthName {

	public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      String s = sc.nextLine();
      System.out.print(UserMainCode.getMonthName(s));
      
		
	}

}
class UserMainCode{
	public static String getMonthName(String s) {
		DateTimeFormatter dt = DateTimeFormatter.ofPattern("dd/MM/yy");
		DateTimeFormatter dt2 = DateTimeFormatter.ofPattern("dd/MM/yy");
		LocalDate ld = LocalDate.parse(s,dt);
		int a = ld.get(ChronoField.MONTH_OF_YEAR);
		switch(a) {
		case 1:
			return ld.format(dt2);
		case 2:
			return "FEBRUARY";
		case 3:
			return "MARCH";
		case 4:
			return "APRIL";
		case 5:
			return "MAY";
		case 6:
			return "JUNE";
		case 7:
			return "JULY";
		case 8:
			return "AUGUST";
		case 9:
			return "SEPTEMBER";
		case 10:
			return "OCTOBER";
		case 11:
			return "NOVEMBER";
		default:
			return "DECEMBER";
		}
	}
}