
public class ArrayFirstAndLast {

	public static void main(String[] args) {
		char[] ch = {'a','b','c','d','a'};
        if(ch[0]==ch[ch.length-1]) {
        	System.out.println("First and last are same");
        }
        else {
        	System.out.println("FIrst and last are not Same");
        }
	}

}
