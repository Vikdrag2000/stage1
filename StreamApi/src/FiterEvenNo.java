import java.util.*;
import java.util.stream.*;
public class FiterEvenNo {
  public static void main(String[] args) {
	
	  List<Integer> li = new ArrayList<>();
	  for(int i=0;i<11;i++) {
		 
			  li.add(i);
		  
	  }
//	  List<Integer> l2 = new ArrayList<>();
//	  for(Integer i: li) {       // Without using Stream
//		  if(i%2==0) {
//			  l2.add(i);
//		  }
//	  }
	  
	  List<Integer> l2 = li.stream().filter(i->i%2==0).collect(Collectors.toList());
	  System.out.println(l2);
	  long a = li.stream().filter(i->i%2!=0).count();
	  long a2 = li.stream().count();
	  System.out.println(a);
	  System.out.println(a2);
  }
}
