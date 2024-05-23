package Car24;

public class CarInfo {

	private String carId;
	private String carName;
	private String carType;
	private String city;
	
	public CarInfo(String carId,String carName,String carType,String city) {
		this.carId=carId;
		this.carName=carName;
		this.carType=carType;
		this.city=city;
	}
	
	public String getCarId() {
		return carId;
	}
	public void setCarId(String s) {
		this.carId=s;
	}
	
	public String getCarName() {
		return carName;
	}
	public void setCarName(String s) {
		this.carName=s;
	}
	
	public String getCarType() {
		return carType;
	}
	public void setCarType(String s) {
       this.carType=s;
	}
	
	public String getCity() {
		return city;
	}
	public void setCity(String s) {
		this.city=s;
	}
	
	public String checkAvailability() {
		
		if(city.equalsIgnoreCase("New York") || city.equalsIgnoreCase("Denver") || city.equalsIgnoreCase("Los Angels")) {
			if(carName.equalsIgnoreCase("Nissan")) {
				if(carType.equalsIgnoreCase("Sedan")) {
					return "Available car and price is: Kicks and $8400.0";
				}
				else if(carType.equalsIgnoreCase("SUV")) {
					return "Available car and price is: Magnite and $10800.0";
				}
				else if(carType.equalsIgnoreCase("MUV")) {
					return "Available car and price is: Terrano and $14400.0";
				}else {
					return "Not Available";
				}
			}
			else if(carName.equalsIgnoreCase("Ford")) {
	            if(carType.equalsIgnoreCase("Sedan")) {
	            	return "Available car and price is: Figo and $4802.0";
				}
				else if(carType.equalsIgnoreCase("SUV")) {
					return "Available car and price is: Eco Sport and $9605.0";
				}
				else if(carType.equalsIgnoreCase("MUV")) {
					return "Available car and price is: Endeavour and $21600.0";
				}else {
					return "Not Available";
				}
			}
			else {
				return "Not Available";
			}
		}
		else {
			return "Not Available";
		}
		
	}

}
