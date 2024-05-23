package HamleysLaptop;

public class LaptopInfo {
	public String laptopId;
	public String modelName;
	public String brandName;
	public double cost;
	
	public LaptopInfo(String laptopId,String modelName,String brandName,double cost) {
       this.laptopId=laptopId;
       this.modelName=modelName;
       this.brandName=brandName;
       this.cost=cost;
	}
	
	 public double calculateLaptopCost() {
		 double d =0;
		 if(cost>0) {
			 if(brandName.equalsIgnoreCase("Apple")) {
				 d= cost-cost*.05;
				 return d;
			 }
			 else if(brandName.equalsIgnoreCase("Dell")) {
				 d= cost-cost*.1;
				 return d;
			 }
			 else if(brandName.equalsIgnoreCase("Samsung")) {
				 d= cost-cost*.15;
				 return d;
			 }
			 else if(brandName.equalsIgnoreCase("Lenovo")) {
				 d= cost-cost*.20;
				 return d;
			 }
		 }
		 return -1;
	 }
}
