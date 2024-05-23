package MonthName;
import java.util.*;
import java.time.*;
import java.time.format.*;
public class demo1 {

	public static void main(String[] args) {

	    Scanner sc = new Scanner(System.in);
			String s =sc.nextLine();
			System.out.println(UserMainCode2.getMonthName(s));

	}

}
class UserMainCode2{
	public static String getMonthName(String s) {
		DateTimeFormatter dt = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		LocalDate ld = LocalDate.parse(s,dt);
		DateTimeFormatter dt2 = DateTimeFormatter.ofPattern("EEEE");
		return ld.format(dt2);
	}
}