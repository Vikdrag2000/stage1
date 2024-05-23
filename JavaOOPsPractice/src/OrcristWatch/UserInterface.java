package OrcristWatch;
import java.util.*;
public class UserInterface {

	public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      String st = sc.nextLine();
      OrderInfo ob = extractDetails(st);
      double d=ob.calculateWatchCost();
		if(d>0) {
			System.out.println("Order Id : "+ob.orderId);
			System.out.println("Customer Name : "+ob.customerName);
			System.out.println("Watch Model : "+ob.watchModel);
			System.out.println("Quantity : "+ob.quantity);
			System.out.println("Total cost to be paid : "+d);
		}else {
			System.out.println("Invalid details");
		}
	}

	public static OrderInfo extractDetails(String orderDetails) {
		String s[]= orderDetails.split(":");
		OrderInfo oi = new OrderInfo(s[0],s[1],s[2],Integer.parseInt(s[3]));
		return oi;
	}

}
