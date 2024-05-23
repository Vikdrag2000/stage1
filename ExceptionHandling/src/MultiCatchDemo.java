
public class MultiCatchDemo {

	public static void main(String[] args) {

		try{
			String a = args[0];
			System.out.println("String: "+a);
			int i = Integer.parseInt(a);
			System.out.println("Int: "+i);
		}
		catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("There is no Argument");
		}
		catch(NumberFormatException e) {
			System.out.println("Argument is not String");
		}
		
		System.out.println("More Code goes on");
		
	}

}
