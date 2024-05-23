package StaticInnerClass;

class Outer{
	int a=9;
	static int b=8;
	
	static class Inner{
		void display() {
			System.out.print("value:"+b);  // here we cannot get "a" because static class get
			                               // only static value
		}
	}
}



public class Test {

	public static void main(String[] args) {

		Outer.Inner obj= new Outer.Inner();  // here static class object created directly
		obj.display();
	}

}
