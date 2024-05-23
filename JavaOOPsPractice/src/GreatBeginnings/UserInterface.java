package GreatBeginnings;
import java.util.*;
import java.time.*;
import java.time.format.*;
public class UserInterface {
    static DateTimeFormatter df = DateTimeFormatter.ofPattern("dd/MM/yyyy");
	
	public static void main(String[] args) {
     Scanner sc = new Scanner(System.in);
		String str=sc.nextLine();
		Event ob = extractDetails(str);
		double d = ob.calculateAmountToBePaid();
		if(d>0) {
			System.out.println("Event Id : "+ob.getEventId());
			System.out.println("Event Type : "+ob.getEventType());
			System.out.println("Date Of Registration : "+ob.getDateOfRegistration().format(df));
			System.out.println("Date Of Event : "+ob.getDateOfEvent().format(df));
			System.out.println("Payment : "+ob.getPayment());
			System.out.println("Amount to be paid by the Customer : "+d);
		}else {
			System.out.println("Invalid Event Details");
		}
	}

	public static Event extractDetails(String eventDetails) {
		String s[] = eventDetails.split(":");
		Event ev = new Event(s[0],s[1],LocalDate.parse(s[2],df),LocalDate.parse(s[3],df),Double.parseDouble(s[4]));
	     return ev;	
	}
}
