package InternalThreading;

public class Product  {

	int value;
	synchronized void setValue(int a) {
		this.value=a;
	}
	synchronized int getValue() {
		return value;
		
	}
}
