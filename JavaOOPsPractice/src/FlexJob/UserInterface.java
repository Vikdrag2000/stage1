package FlexJob;
import java.util.*;
public class UserInterface {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      Scanner sc = new Scanner(System.in);
      String str = sc.nextLine();
      EmployeeInfo ob= extractDetails(str);
      double d=ob.calculateSalary();
      if(d>0) {
    	  System.out.println("Employee Id : "+ob.employeeId);
    	  System.out.println("Employee Name : "+ob.employeeName);
    	  System.out.println("Job name: "+ob.jobName);
    	  System.out.println("Years Of Experience:"+ob.yearsOfExperience);
    	  System.out.println("Worked Hours : "+ob.workedHours);
    	  System.out.println("Salary Amount : "+d);
    	  
      }else {
    	  System.out.println("Invalid Employee details");
      }
	}
	public static EmployeeInfo extractDetails(String employeeDetails) {
		String arr[]= employeeDetails.split(":");
		EmployeeInfo em = new EmployeeInfo(arr[0],arr[1],arr[2],Integer.parseInt(arr[3]),Integer.parseInt(arr[4]));
		return em;
	}
}
