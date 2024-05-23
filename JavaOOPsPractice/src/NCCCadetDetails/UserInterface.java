package NCCCadetDetails;
import java.util.*;
public class UserInterface {

	public static void main(String[] args) {
     Scanner sc = new Scanner(System.in);
     String st = sc.nextLine();
     Cadet c = extractDetails(st);
     double d = c.calculateFeesToBePaid();
     if(d>0) {
    	 System.out.println("Cadet Number : "+c.cadetNumber);
    	 System.out.println("Cadet Name : "+c.cadetName);
    	 System.out.println("Group Name : "+c.groupName);
    	 System.out.println("Gender : "+c.gender);
    	 System.out.println("Age : "+c.age);
    	 System.out.printf("Fees to be paid by the Cadet : %.2f",d);
     }else {
    	 System.out.println("Invalid Cadet Details");
     }
		
	}

	public static Cadet extractDetails (String cadetDetails) {
		String s[]= cadetDetails.split(":");
		Cadet cd = new Cadet(s[0],s[1],s[2],s[3],Integer.parseInt(s[4]));
		return cd;
	}

}
