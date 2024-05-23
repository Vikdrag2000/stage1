package p1;
	
	public class A {
	     private int a=90;
	     int b=56;
	     protected static int  c=78;
	     
		public static void main(String[] args) {
          A onj= new A();
          System.out.println(onj.a);
          System.out.println(onj.b);
          System.out.println(onj.c);
          
          Px px = new Px();
          System.out.println(px.a);
		}
		public static int Sum() {
			return 6+79;
		}

	}



