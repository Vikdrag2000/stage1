package HireYourGrade;
import java.util.*;
import java.time.*;
import java.time.format.*;
public class UserInterface {
     static DateTimeFormatter df = DateTimeFormatter.ofPattern("dd/MM/yyyy");
	public static void main(String[] args) {
      Scanner sc  = new Scanner(System.in);
      String st = sc.nextLine();
      Recruitment ob = extractDetails(st);
      double d = ob.calculatePackageReceived();
      if(d>0) {
    	  System.out.println("Recruitment Id : "+ob.getRecruitmentId());
    	  System.out.println("Company Name : "+ob.getCompanyName());
    	  System.out.println("Job Title : "+ob.getJobTitle());
    	  System.out.println("Date Of Post : "+ob.getDateOfPost().format(df));
    	  System.out.printf("Package paid by the Company is %.2f",d);
      }else {
    	  System.out.println("Invalid Recruitment Details");
      }
		sc.close();
	}
	
	public static Recruitment extractDetails(String recruitmentDetails) {
		String s[] = recruitmentDetails.split(":");
		Recruitment ob = new Recruitment(s[0],s[1],s[2],LocalDate.parse(s[3],df));
		return ob;
	}

}
