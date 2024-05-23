package regex;

public class Quantifiers {

	public static void main(String[] args) {
      String s2 = "this was the good time 56 of";
      String reg[]= {
    		  "[a-zA-Z]*$",
    		  "[a-zA-Z]{3}",
    		  "[0-9]*",
    		  "wa|he",
    		  "[6] \\b",
    		  "[o]{1,}"
      };
      for(String s: reg) {
    	  String out = s2.replaceAll(s, "=");
    	  System.out.println(out);
      }
		
	}

}
