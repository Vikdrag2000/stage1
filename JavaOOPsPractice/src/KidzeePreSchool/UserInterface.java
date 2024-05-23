package KidzeePreSchool;
import java.util.*;
public class UserInterface {

	public static void main(String[] args) {
     Scanner sc = new Scanner(System.in);
     String str = sc.nextLine();
     AdmissionInfo ad2 = extractDetails(str);
     double d = ad2.calculateTotalFee();
		if(d>0) {
			System.out.println("Admission Details");
			System.out.println("Admission Number: "+ad2.admissionNumber);
			System.out.println("Child Name : "+ad2.childName);
			System.out.println("Program name: "+ad2.programName);
			System.out.println("Program fee : "+ad2.programFee);
			System.out.println("Admission fee : "+ad2.admissionFee);
			System.out.println("Total fee : "+d);
		}else {
			System.out.println("Invalid admission details");
		}
	}
	public static AdmissionInfo extractDetails(String admissionDetails) {
		String st[]= admissionDetails.split(":");
		AdmissionInfo ad = new AdmissionInfo(st[0],st[1],st[2],Double.parseDouble(st[3]),Double.parseDouble(st[4]));
		return ad;
		
	}
}
