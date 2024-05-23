
public class CompileTimeBinding {
     void add(int a ,int b) {
    	 System.out.println(a+b);
     }
     void add(float a ,float b) {
    	 System.out.println(a+b);
     }
     void add(float a ,float b,float c) {
    	 System.out.println(a+b+c);
     }
	public static void main(String[] args) {
		CompileTimeBinding v = new CompileTimeBinding();
        v.add(7, 8);
        v.add(9.7f, 9.6f);
        v.add(6.6f, 7.8f, 6.6f);
	}

}
