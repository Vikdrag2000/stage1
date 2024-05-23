package CycleSavvy;

public class CycleInfo {

	private String cycleId;
	private String cycleName;
	private String cycleType;
	private String accessories;
	private double price;
	
	public CycleInfo(String cycleId,String cycleName,String cycleType,String accessories,double price){
		this.cycleId=cycleId;
		this.cycleName=cycleName;
		this.cycleType=cycleType;
		this.accessories=accessories;
		this.price=price;
	}
	public String getCycleId() {
		return cycleId;
	}
	public void setCycleId(String s) {
		this.cycleId=s;
	}
	
	public String getCycleName() {
		return cycleName;
	}
	public void setCycleName(String s) {
		this.cycleName=s;
	}
	
	public String getCycleType() {
		return cycleType;
	}
	public void setCycleType(String s) {
		this.cycleType=s;
	}
	
	public String getAccessories() {
		return accessories;
	}
	public void setAccessories(String s) {
		this.accessories=s;
	}

	public double getPrice() {
		return price;
	}
	public void setPrice(double s) {
		this.price=s;
	}
	
	public double calculateBillAmount() {
		double c=0;
		if(price>0) {
			switch(cycleType) {
			case  "Road Cycle":
				if(accessories.equalsIgnoreCase("yes")) {
					c=price+(price*.02)+1000;
					return c;
				}
				else if(accessories.equalsIgnoreCase("no")) {
					c=price+(price*.02);
					return c;
				}else { return -1;}
				
			case   "Mountain Cycle":
                if(accessories.equalsIgnoreCase("yes")) {
                	c=price+(price*.05)+1000;
					return c;
				}
				else if(accessories.equalsIgnoreCase("no")) {
					c=price+(price*.05);
					return c;
				}else { return -1;}
				
				
			case   "Hybrid Cycle":
                if(accessories.equalsIgnoreCase("yes")) {
                	c=price+(price*.06)+1000;
					return c;
				}
				else if(accessories.equalsIgnoreCase("no")) {
					c=price+(price*.06);
					return c;
				}else { return -1;}
				
				
			case   "Touring Cycle":
                if(accessories.equalsIgnoreCase("yes")) {
                	c=price+(price*.04)+1000;
					return c;
				}
				else if(accessories.equalsIgnoreCase("no")) {
					c=price+(price*.04);
					return c;
				}else { return -1;}
				
				
			case   "Electric Cycle":
                if(accessories.equalsIgnoreCase("yes")) {
                	c=price+(price*.03)+1000;
					return c;
				}
				else if(accessories.equalsIgnoreCase("no")) {
					c=price+(price*.03);
					return c;
				}else { return -1;}

				
			default:
				return -1;
			}
		}
		return -1;
	}
}
