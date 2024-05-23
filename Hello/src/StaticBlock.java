
public class StaticBlock {
     static int num=9;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
      System.out.println("Void Main");
      method();
      System.out.println(StaticBlock.num);
	}
    static void method() {
    	System.out.println("Static Method");
    }
	static {
		System.out.println("Static");
		method();
	}

}
