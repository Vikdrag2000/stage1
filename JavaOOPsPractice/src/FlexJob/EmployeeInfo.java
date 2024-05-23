package FlexJob;

public class EmployeeInfo {

	public String employeeId;
	public String employeeName;
	public String jobName;
	public int yearsOfExperience;
	public int workedHours;
	
	
	public EmployeeInfo(String employeeId,String employeeName,String jobName,int yearsOfExperience,
			 int workedHours) {
		this.employeeId=employeeId;
		this.employeeName=employeeName;
		this.jobName=jobName;
		this.yearsOfExperience=yearsOfExperience;
		this.workedHours=workedHours;
		
	}
	 public  double calculateSalary() {
		 double salary=0;
		 if(yearsOfExperience>0 && workedHours>0) {
			 if(jobName.equalsIgnoreCase("Video Editor")) {
				 if(yearsOfExperience<=2) {
					 salary= (workedHours*15)+(workedHours*15*.1);
					 return salary;
				 }
				 else if(yearsOfExperience<=5) {
					 salary= (workedHours*15)+(workedHours*15*.25);
					 return salary;
				 }
				 else if(yearsOfExperience>=6) {
					 salary= (workedHours*15)+(workedHours*15*.4);
					 return salary;
                 }
			 }
			 else if(jobName.equalsIgnoreCase("Teaching Assistant")) {
				 if(yearsOfExperience<=2) {
					 salary= (workedHours*50)+(workedHours*50*.1);
					 return salary;
				 }
				 else if(yearsOfExperience<=5) {
					 salary= (workedHours*50)+(workedHours*50*.25);
					 return salary;
				 }
				 else if(yearsOfExperience>=6) {
					 salary= (workedHours*50)+(workedHours*50*.4);
					 return salary;
                 }
			 }
			 else if(jobName.equalsIgnoreCase("Telecalling Executive")) {
				 if(yearsOfExperience<=2) {
					 salary= (workedHours*25)+(workedHours*25*.1);
					 return salary;
				 }
				 else if(yearsOfExperience<=5) {
					 salary= (workedHours*25)+(workedHours*25*.25);
					 return salary;
				 }
				 else if(yearsOfExperience>=6) {
					 salary= (workedHours*25)+(workedHours*25*.4);
					 return salary;
                 }
			 }
			 else if(jobName.equalsIgnoreCase("Graphic Designer")) {
				 if(yearsOfExperience<=2) {
					 salary= (workedHours*60)+(workedHours*60*.1);
					 return salary;
				 }
				 else if(yearsOfExperience<=5) {
					 salary= (workedHours*60)+(workedHours*60*.25);
					 return salary;
				 }
				 else if(yearsOfExperience>=6) {
					 salary= (workedHours*60)+(workedHours*60*.4);
					 return salary;
                 }
			 }
		 }
		 return 0;
	 }
}
