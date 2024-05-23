
public class StringHandling {
	int a;
	String name;
	public StringHandling(int a,String name) {
		this.a=a;
		this.name=name;
	}
  public static void main(String[] args) {
	  String s = new String("Viaksh");
	  char ch[]= {'V','K','s'};
	  String s2 = new String(ch);
	  byte v[]= {67,78,90};
	  String s3 = new String(v);
	  System.out.println(s);
	  System.out.println(s2);
	  System.out.println(s3);
  }
}
