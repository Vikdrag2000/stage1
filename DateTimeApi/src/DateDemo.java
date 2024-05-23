import java.time.*;
import java.util.*;
public class DateDemo {

	public static void main(String[] args) {

		System.out.println(System.currentTimeMillis()/1000/60/60/24/365);  // till year from 1970
		System.out.println(Long.MAX_VALUE/1000/60/60/24/365); // gives year till java time exist
		
		Date d = new Date();
		System.out.println(d.getDay());
		System.out.println(d.getYear()+1900);
		Date d2 = new Date("11/29/2023");
		System.out.println(d2.getYear()+1900);
	}

}
