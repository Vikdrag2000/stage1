package FeeInsights;
import java.util.regex.*;
public class Transaction {
	public String mobileNumber;
	public String bankName;
	public String ifscCode;
	public String platform;
	public double amount;
	
	public Transaction(String mobileNumber,String bankName,String ifscCode,String platform,double amount){
		this.mobileNumber=mobileNumber;
		this.bankName=bankName;
		this.ifscCode=ifscCode;
		this.platform=platform;
		this.amount=amount;
	}
	
	public double calculatePlatformFee() {
		double fee=0;
		boolean b = Pattern.matches("[A-Z]{4}[A-Z0-9]{7}", ifscCode);
		if(b) {
			if(amount<=100000 && amount>0) {
				if(platform.equalsIgnoreCase("Gpay")) {
					if(amount>0 && amount<=10000) {
						fee= amount*.02;
						return fee;
					}
					else if(amount>10000 && amount<=50000) {
						fee= amount*.05;
						return fee;
					}
					else {
						fee= amount*.08;
						return fee;
					}
				}
				else if(platform.equalsIgnoreCase("PayTM")) {
                    if(amount>0 && amount<=10000) {
                    	fee= amount*.01;
						return fee;
					}
					else if(amount>10000 && amount<=50000) {
						fee= amount*.03;
						return fee;
					}
					else {
						fee= amount*.06;
						return fee;
					}
				}
                else if(platform.equalsIgnoreCase("PhonePe")) {
                    if(amount>0 && amount<=10000) {
                    	fee= amount*.03;
						return fee;
					}
					else if(amount>10000 && amount<=50000) {
						fee= amount*.04;
						return fee;
					}
					else {
						fee= amount*.07;
						return fee;
					}
				} 
			}
		}
		return -1;
	}
	
}
