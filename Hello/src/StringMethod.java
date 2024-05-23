
public class StringMethod {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    String st ="Vikash";
   /* System.out.println(st.length());
    System.out.println(st.indexOf('h'));
    System.out.println(st.charAt(5));
    System.out.println(st.substring(3));
    System.out.println(st.substring(0,5));*/
    
    String name = "My self vikash kumar rai";
    String[] result=name.split("e");
    for(int i=0;i<result.length;i++) {
    	System.out.println(result[i]);
    }
	}
}
