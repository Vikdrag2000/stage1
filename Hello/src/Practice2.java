
public class Practice2 {
	public static void main(String[] args) {
		
		StringHandling fr = new StringHandling(34,"Vikash");
		System.out.println(fr);
		
		Integer i = new Integer(456);//Integer Class is mutable
		System.out.println(i);
		
		
		String s1 ="Vikash"; //s1 and s2 has same memory address
		String s2 ="Vikash"; //s1 and s2 has same memory address
		System.out.println(s1.hashCode());
		System.out.println(s2.hashCode());
	}	
}
