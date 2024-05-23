
public class StringParse {

	public static void main(String[] args) {
      try {
    	  System.out.println("String to int");
    	  int i = Integer.parseInt("8y");
  		System.out.println(i); 
      }
		catch(NumberFormatException e) {
			System.out.println("It's cannot Parse");
		}
      
	}

}
