
public class DoubleDemo extends A {
    // int a[];
     public DoubleDemo(){super(3);} 
     void displayA(){
    	 System.out.print(A.a);}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		double d = 25.5;
//		int a =10;;;
//      System.out.println(d%a);
//      
//      DoubleDemo d3 = new DoubleDemo();
//      for(int i=0;i<d3.a.length;i++) {
//      System.out.println(d3.a[i]);
//      }
		new DoubleDemo().displayA();
	}

}
class A{ static int a; 
A(int a)
{a=4;}
}

