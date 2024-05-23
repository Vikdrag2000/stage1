package HamleysLaptop;
import java.util.*;
public class UserInterface {

	public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
	  String st = sc.nextLine();
	  LaptopInfo ob= extractDetails(st);
	  double d= ob.calculateLaptopCost();
	 // System.out.println("Enter the laptop details");
	  if(d>0) {
		  System.out.println("Laptop Details");
		  System.out.println("Laptop Id: "+ob.laptopId);
		  System.out.println("Model Name : "+ob.modelName);
		  System.out.println("Brand Name: "+ob.brandName);
		  System.out.println("Laptop cost : "+d);
	  }else {
		  System.out.println("Invalid laptop details");  
	  }
	}
	public static LaptopInfo extractDetails(String laptopDetails) {
		String arr[]=laptopDetails.split(":");
		LaptopInfo lp = new LaptopInfo(arr[0],arr[1],arr[2],Double.parseDouble(arr[3]));
		return lp;
	}
}
