package ValidatingDateFormat;
import java.util.*;
public class Main {

	public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      String st = sc.nextLine();
      int a = UserMainCode.validateDate(st);
      if(a==1) {
      System.out.println("Valid date format");
      }
      else {
    	  System.out.println("Invalid date format");  
      }
	}

}
