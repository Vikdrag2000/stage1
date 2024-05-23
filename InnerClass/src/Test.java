
class OuterClass {
int x=9;
Inner i = new Inner();
		class Inner{
			int y=8;
			void inner() {
				System.out.println("Sum X&Y:"+(x+y));
			}
		}
		
		void outer() {
			
			System.out.println("Value X"+x);
			System.out.println("Value Y:"+i.y);
		}
}

public class Test {

	public static void main(String[] args) {
		OuterClass oc = new OuterClass();
		OuterClass.Inner on = new OuterClass().new Inner();
		oc.i.inner();
		oc.outer();
		on.inner();
		System.out.println("Value X");

	}

}

