package MaxFitEquipments;

public class CustomerInfo {

	 String customerId;
	 String customerName;
	 String phoneNumber;
	 String productName;
	 int maxWeight;
	 int dailyWorkoutHours;
	 
	 
	 public CustomerInfo(String customerId,String customerName,String phoneNumber,String productName,
			 int maxWeight,int dailyWorkoutHours) {
		 this.customerId=customerId;
		 this.customerName=customerName;
		 this.phoneNumber=phoneNumber;
		 this.productName=productName;
		 this.maxWeight=maxWeight;
		 this.dailyWorkoutHours=dailyWorkoutHours;
	 }
	 
	 public double calculateBillAmount() {
		 double d=0;
		 if(maxWeight<=140 && dailyWorkoutHours<=13 ) {
			 if(productName.equalsIgnoreCase("Tread Mill") && maxWeight<=140) {
				 if(dailyWorkoutHours<=4) {
					 d= 14999+14999*.17;
					 return d;
				 }
				 else  if(dailyWorkoutHours<=8) {
					 d= 19999+19999*.17;
					 return d;
				 }
				 else  if(dailyWorkoutHours<=13) {
					 d= 24999+24999*.17;
					 return d;
				 }
			 }
			 else if(productName.equalsIgnoreCase("Elliptical Trainer") && maxWeight<=120) {
				 if(dailyWorkoutHours<=4) {
					 d= 9599+9599*.17;
					 return d;
				 }
				 else  if(dailyWorkoutHours<=8) {
					 d= 12599+12599*.17;
					 return d;
				 }
				 else  if(dailyWorkoutHours<=13) {
					 d= 14999+14999*.17;
					 return d;
				 }
			 }
			 else if(productName.equalsIgnoreCase("Air Bike") && maxWeight<=100) {
				 if(dailyWorkoutHours<=4) {
					 d= 4999+4999*.17;
					 return d;
				 }
				 else  if(dailyWorkoutHours<=8) {
					 d= 7499+7499*.17;
					 return d;
				 }
				 else  if(dailyWorkoutHours<=13) {
					 d= 9999+9999*.17;
					 return d;
				 }
			 } 
		 }
		 return 0;
	 }
}
