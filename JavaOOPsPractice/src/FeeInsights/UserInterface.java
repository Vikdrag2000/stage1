package FeeInsights;
import java.util.*;
public class UserInterface {

	public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      String str = sc.nextLine();
      Transaction ob = extractDetails(str);
      double d = ob.calculatePlatformFee();
      if(d>0) {
    	  System.out.println("Mobile Number: "+ob.mobileNumber);
    	  System.out.println("Bank Name: "+ob.bankName);
    	  System.out.println("IFSC Code: "+ob.ifscCode);
    	  System.out.println("Platform: "+ob.platform);
    	  System.out.println("Amount: "+ob.amount);
    	  System.out.println("Platform Fee: Rs. "+d);
    	  
      }else {
    	  System.out.println("Invalid Transaction details");
      }
		
	}
	 public static  Transaction extractDetails(String transactionDetails) {
		 String st[] = transactionDetails.split(":");
		 Transaction tj = new Transaction(st[0],st[1],st[2],st[3],Double.parseDouble(st[4]));
		 return tj;
	 }
}
