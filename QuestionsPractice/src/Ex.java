
public class Ex {
	public static void main(String[] args){
		try{
		method();
		System.out.println("method() called");
		}
		catch(ArithmeticException ex){
		System.out.println("Arithmetic Exception");
		}
		catch(RuntimeException re){
		System.out.println("Runtime Exception");
		}}
		static void method(){
		int y = 2 / 0;
		}
}
