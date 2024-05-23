import java.util.*;
import java.util.stream.*;

public class OtherMethod {

	public static void main(String[] args) {

		  List<Integer> li = new ArrayList<>();
		  for(int i=8;i>=0;i--) {
			 
				  li.add(i);
			  
		  }
		  
		  List<Integer> li2 = li.stream().sorted().collect(Collectors.toList());
		  System.out.println(li2);
		  
		  Comparator<Integer> comp = (i,i2)->i.compareTo(i2);
		  Integer a = li.stream().max(comp).get();
		  System.out.println(a);
		  Integer a2 = li.stream().min(comp).get();
		  System.out.println(a2);
		  
		  li.stream().forEach(i->System.out.println(i));
	}

}
