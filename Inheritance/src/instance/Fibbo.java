package instance;

public class Fibbo {

	public static void main(String[] args) {
		int a=0;
		int b=1;
		int c=0;
		System.out.print(a+" ");
		System.out.print(b+" ");
		for(int i=0;i<10;i++) {
			c=b;
			b=b+a;
			System.out.print(b+" ");
			a=c;
			
			
		}
	}
}
