package MaxFitEquipments;
import java.util.*;
public class UserInterface {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       Scanner sc = new Scanner(System.in);
       String str = sc.nextLine();
       CustomerInfo c = extractDetails(str);
       double d = c.calculateBillAmount();
       if(d>0) {
    	   System.out.println("Customer Id : "+c.customerId);
    	   System.out.println("Customer Name : "+c.customerName);
    	   System.out.println("Phone Number : "+c.phoneNumber);
    	   System.out.println("Product name: "+c.productName);
    	   System.out.println("Maximium Weight : "+c.maxWeight);
    	   System.out.println("Daily Workout Hours : "+c.dailyWorkoutHours);
    	   System.out.println("Bill Amount : $ "+d);
       }else {
    	   System.out.println("Invalid Details");
       }
	}


	 
	 
    public static CustomerInfo extractDetails(String customerDetails) {
    	String sp[] = customerDetails.split(":");
    	CustomerInfo ci = new CustomerInfo(sp[0],sp[1],sp[2],sp[3],Integer.parseInt(sp[4]),Integer.parseInt(sp[5]));
    	return ci;
    }
}
