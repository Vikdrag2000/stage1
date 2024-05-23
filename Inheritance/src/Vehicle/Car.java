package Vehicle;

public class Car extends Vehicle{
  
	@Override
	String fuel() {
		super.fuel(); //its not work because its a return type it works in void type
		return "Diesel";
	}
}
