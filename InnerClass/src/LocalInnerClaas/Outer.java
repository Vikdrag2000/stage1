package LocalInnerClaas;

public class Outer {

	void display() {
		class Inner{
			void display() {
				System.out.println("Inner");
			}
		}
		Inner i = new Inner();
		i.display();
	}
	
	public static void main(String[] args) {
        Outer o = new Outer();
        o.display();
	}

}
