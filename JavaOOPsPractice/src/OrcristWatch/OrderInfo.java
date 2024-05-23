package OrcristWatch;

public class OrderInfo {
	String orderId;
	String customerName;
	String watchModel;
	int quantity;
	
	public OrderInfo(String orderId,String customerName,String watchModel,int quantity) {
		this.orderId=orderId;
		this.customerName=customerName;
		this.watchModel=watchModel;
		this.quantity=quantity;
	}
	
	public double calculateWatchCost() {
		double d =0;
		if(quantity>0) {
			if(watchModel.equalsIgnoreCase("OrcristVox2")) {
				d=quantity*5200;
				return d;
			}
			else if(watchModel.equalsIgnoreCase("OrcristVox1")) {
				d=quantity*4600;
				return d;
			}
			else if(watchModel.equalsIgnoreCase("OrcristTrx1000")) {
				d=quantity*3200;
				return d;
			}
			else if(watchModel.equalsIgnoreCase("OrcristRvs2")) {
				d=quantity*2500;
				return d;
			}
			
		}
		return -1;
	}

}
