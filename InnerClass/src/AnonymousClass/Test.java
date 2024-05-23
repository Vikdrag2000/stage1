package AnonymousClass;

public class Test{

	public static void main(String[] args) {
		Outer o = new Outer(){                //its called anonymous class
			public void display() {
				System.out.print("Hey Interface");
			}
	    };
	    o.display();
	
  }
	
}
