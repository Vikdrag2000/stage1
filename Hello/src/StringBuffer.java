
public class StringBuffer {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     StringBuilder sb = new StringBuilder();
     System.out.println(sb.capacity());
     sb.append("Always Have Positive Attitude ");
     //sb=sb.append("Always Have Positive Attitude ");

     System.out.println(sb.capacity());
     System.out.println(sb.charAt(10));
     System.out.println(sb.reverse());
     System.out.println(sb.insert(4,"Hey"));
     System.out.println(sb.delete(4,9));
	}

	
}
