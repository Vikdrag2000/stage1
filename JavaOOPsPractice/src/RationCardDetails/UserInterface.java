package RationCardDetails;
import java.util.*;
public class UserInterface {

	public static void main(String[] args) {
     Scanner sc = new Scanner(System.in);
     String st = sc.nextLine();
     RationCard ob = extractDetails(st);
     double d = ob.calculateBillAmount();
     if(d>0) {
    	 
    	 System.out.println("Ration Card Id : "+ob.rationCardId);
    	 System.out.println("Holder Name : "+ob.holderName);
    	 System.out.println("Card Colour : "+ob.cardColour);
    	 System.out.println("Quantity : "+ob.quantity);
    	 System.out.println("Price : "+ob.price);
    	 System.out.printf("Amount to be paid by the Customer %.2f",d);
     }else {
    	 System.out.println("Invalid Ration card details");
     }
		
	}

	public static RationCard extractDetails (String cardDetails) {
		String s[] = cardDetails.split(":");
		RationCard rt = new RationCard(s[0],s[1],s[2],Double.parseDouble(s[3]),Double.parseDouble(s[4]));
	    return rt;	
	}
}
