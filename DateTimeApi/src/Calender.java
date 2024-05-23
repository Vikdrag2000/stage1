import java.util.*;
public class Calender {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      GregorianCalendar gc = new GregorianCalendar();
      System.out.println(gc.isLeapYear(2024));
    
      TimeZone tz = gc.getTimeZone();
      System.out.println(tz);
	}

}
