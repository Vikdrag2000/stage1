package Car24;
import java.util.Scanner;
public class UserInterface {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      Scanner sc = new Scanner(System.in);
      String str = sc.nextLine();
      CarInfo ob= extractDetails(str);
      if(ob.checkAvailability().equals("Not Available")) {
    	  System.out.print("Not Available");
      }else {
      System.out.println("Car Id : "+ob.getCarId());
      System.out.println("Car Name: "+ob.getCarName());
      System.out.println("Car Type : "+ob.getCarType());
      System.out.println("City : "+ob.getCity());
      System.out.println(ob.checkAvailability());
      }
	}

	 
	public static CarInfo extractDetails(String carDetails) {
		String arr[] = carDetails.split(":");
		CarInfo obj = new CarInfo(arr[0],arr[1],arr[2],arr[3]);
		return obj;
	}
}
