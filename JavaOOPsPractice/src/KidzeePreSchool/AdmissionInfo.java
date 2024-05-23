package KidzeePreSchool;

public class AdmissionInfo {

	public String admissionNumber;
	public String childName;
	public String programName;
	public double programFee;
	public double admissionFee;
	
	public AdmissionInfo(String admissionNumber,String childName,String programName,double programFee,
			double admissionFee) {
		this.admissionNumber=admissionNumber;
		this.childName=childName;
		this.programFee=programFee;
		this.programName=programName;
		this.admissionFee=admissionFee;
	}
	
	public double calculateTotalFee() {
		double d =0;
			if(programFee>0) {
				if(programName.equalsIgnoreCase("Play group")) {
				   d= admissionFee+programFee*.9;  
				   programFee=programFee*.9;
				   return d;
			     }
				else if(programName.equalsIgnoreCase("Junior")) {
					   d= admissionFee+programFee*.85;  
					   programFee=programFee*.85;
					   return d;
				     }
				else if(programName.equalsIgnoreCase("Senior")) {
					   d= admissionFee+programFee*.8;
					   programFee=programFee*.85;
					   return d;
				     }
				
		}
		return -1;
	}
}
