package RationCardDetails;

public class RationCard {

	String rationCardId;
	String holderName;
	String cardColour;
	double quantity;
	double price;
	
	public RationCard(String rationCardId,String holderName,String cardColour,double quantity,double price) {
		this.rationCardId=rationCardId;
		this.holderName=holderName;
		this.cardColour=cardColour;
		this.quantity=quantity;
		this.price=price;
	}
	
	 public  double calculateBillAmount() {
		 double d=0;
		 if(price>0 && quantity>0) {
			 if(cardColour.equalsIgnoreCase("Pink")) {
				 d=quantity*price*.8;
				 return d;
			 }
			 else  if(cardColour.equalsIgnoreCase("Blue")) {
				 d=quantity*price*.91;
				 return d;
			 }
			 else  if(cardColour.equalsIgnoreCase("Yellow")) {
				 d=quantity*price*.85;
				 return d;
			 }
		 }
		 return -1;
	 }
}
