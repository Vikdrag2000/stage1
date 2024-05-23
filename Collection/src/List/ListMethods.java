package List;
import java.util.*;

public class ListMethods {

	public static void main(String[] args) {
      List<Integer> list = new ArrayList<Integer>();
      for(int i=10;i<=100;i+=10) {
    	  list.add(i);
      }
      System.out.println("Intial"+list);
      
      list.add(2,300);
      System.out.println("After Adding"+list);
      
      list.set(3, 600);
      System.out.println("After Reaplace"+list);
      
      List<Integer> secondList = new ArrayList<Integer>();
      secondList.add(222);
      secondList.add(333);
      secondList.add(444);
      
      System.out.println("Second list"+secondList);
      
      list.addAll(4, secondList);   //this method Add two list
      System.out.println("After Fist and second"+list);
      
      if(list.contains(2522)) {
    	  System.out.println("Yes");
      }
      else {
    	  System.out.println("N0");
      }
      System.out.println("List Size");
      for(int i=0;i<list.size();i++) {
    	  System.out.println(list.get(i));
      }
      
      list.remove(3);
      System.out.println(list);
	}

}
