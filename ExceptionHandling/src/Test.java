
public class Test {

	static ArrayIndexDemo a;
	public static void main(String[] args) {

		try{
			Test.a.method();
		}catch(NullPointerException e) {
			System.out.println("Please create Insatance");
		}
	}

}
