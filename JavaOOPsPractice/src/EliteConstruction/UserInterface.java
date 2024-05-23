package EliteConstruction;
import java.util.*;
//import java.util.Date;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.*;
import java.time.format.DateTimeFormatter;
public class UserInterface {
   // static SimpleDateFormat df = new SimpleDateFormat("dd/MM/yyyy"); 
	static DateTimeFormatter dt = DateTimeFormatter.ofPattern("dd/MM/yyyy");
	public static ProjectInfo extractDetails (String projectDetails) throws Exception {
		String s[] = projectDetails.split(":");
		
		//Date date=df.parse(s[3]);
		ProjectInfo ob = new ProjectInfo(s[0],s[1],Integer.parseInt(s[2]),LocalDate.parse(s[3],dt),LocalDate.parse(s[4],dt));
		return ob;
	}

	public static void main(String[] args) throws Exception {

		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
		ProjectInfo p = extractDetails(str);
		double d = p.calculateAmountToBePaid();
		if(d>0) {
			System.out.println("Project Id : "+p.getProjectId());
			System.out.println("Construction Type : "+p.getConstructionType());
			System.out.println("Total Square Feet : "+p.getTotalSquareFeet());
			System.out.println("Date Of Registration : "+p.getDateOfRegistration().format(dt));
			System.out.println("Date Of Completion : "+p.getDateOfCompletion().format(dt));
			System.out.println("Amount to be paid by the Customer : "+d);
			
		}else {
			System.out.println("Invalid Project Details");
		}
	}

}
