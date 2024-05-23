package CollectionsPart;
import java.util.*;

public class MergedArrayDemo2 {

	public static void main(String[] args) {
		  String[]  s = {"A","B","C"};
		  String[]  s1 = {"D","E","F"};
		  
		  List<String> list = new ArrayList<>(Arrays.asList(s));//Arraylist is used because list we get 
		   //from array is static so when we convert it to a list using array list the new list will be
		  // dynamic and there we perform add all operation
		                           
		  list.addAll(Arrays.asList(s1));                       
		  Object[] merge = list.toArray();
		  System.out.println(Arrays.toString(merge));
	}
}
