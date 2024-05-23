package LambaPaasasParameter;

@FunctionalInterface
interface MyLambda{
  void display();	
}

class Test{
	void print(MyLambda ml) {
		ml.display();
	}
}
class Test2{
	void insert() {
		Test ts = new Test();
		ts.print(()->{System.out.print("Passing Lambda Expression");});
	}
}
public class Demo {

	public static void main(String[] args) {

		Test2 ts = new Test2();
		ts.insert();
	}

}
