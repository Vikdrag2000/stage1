package TheSpiceSensation;
import java.util.*;
public class UserInterface {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       Scanner sc = new Scanner (System.in);
       String st = sc.nextLine();
       Spice ob = extractDetails(st);
       if(ob.findSpiceLevel().equals("Error")) {
    	   System.out.println("Invalid spice details");
       }else {
    	   System.out.println("Spice Name: "+ob.spiceName);
    	   System.out.println("Origin: "+ob.origin);
    	   System.out.println("Spice Rating: "+ob.spiceRating);
    	   System.out.println("Spice Color: "+ob.color);
    	   System.out.println("Spice Shelf Life: "+ob.shelfLifeInMonths);
    	   System.out.println("Spice Level: "+ob.findSpiceLevel());
       }
       
	}

	 public static Spice extractDetails(String spiceDetails) {
		 String s[]= spiceDetails.split(":");
		 Spice sp = new Spice(s[0],s[1],Integer.parseInt(s[2]),s[3],Integer.parseInt(s[4]));
		 return sp;
	 }
}
