package NCCCadetDetails;

public class Cadet {

	public String cadetNumber;
	public String cadetName;
	public String groupName;
	public String gender;
	public int age;
	
	public Cadet(String cadetNumber,String cadetName,String groupName,String gender,int age) {
		this.cadetNumber=cadetNumber;
		this.cadetName=cadetName;
		this.groupName=groupName;
		this.gender=gender;
		this.age=age;
	}
	
	 public double calculateFeesToBePaid() {
		 double d=0;
		 if(groupName.equalsIgnoreCase("Trollers")) {
			 if(age>=11 && age<=15) {
				 d= 2500;
				 return d;
			 }
			 else if(age>=16 && age<=20) {
				 d= 3000;
				 return d;
			 }
			 else if(age>=21 && age<=25) {
				 d= 3200;
				 return d;
			 }
			 else if(age>=26 && age<=30) {
				 d= 3800;
				 return d;
			 }
			 else if(age>=31 && age<=35) {
				 d= 4200;
				 return d;
			 }
		 }
		 return -1;
	 }
}
