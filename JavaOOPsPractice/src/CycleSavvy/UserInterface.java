package CycleSavvy;
import java.util.*;
public class UserInterface {

	public static void main(String[] args) {
     Scanner sc = new Scanner(System.in);
	 String s = sc.nextLine();
	 CycleInfo ob = extractDetails(s);
	 double d = ob.calculateBillAmount();
	 if(d>0) {
		 System.out.println("Cycle Details"); 
		 System.out.println("Cycle ID: "+ob.getCycleId()); 
		 System.out.println("Cycle Name: "+ob.getCycleName()); 
		 System.out.println("Cycle Type: "+ob.getCycleType()); 
		 System.out.println("Wanted Accessories: "+ob.getAccessories()); 
		 System.out.println("Cycle Price: "+ob.getPrice()); 
		 System.out.println("Bill amount to be paid: "+d); 
		 
	 }else {
		 System.out.println("Invalid Cycle details");
	 }
	}

	public static CycleInfo extractDetails(String cycleDetails) {
		String str[] = cycleDetails.split(":");
		CycleInfo obj = new CycleInfo(str[0],str[1],str[2],str[3],Double.parseDouble(str[4]));
		return obj;
	}

}
