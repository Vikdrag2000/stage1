package List;
import java.util.*;

public class ArrayList1 {
	public static void main(String[] args) {
		
		ArrayList<Integer> list = new ArrayList<>();   //here <Integer>  is generic
		list.add(new Integer(20));
		list.add(20);
		list.add(8);
		//list.add("Heyy");
		System.out.println(list);
		
		Iterator<Integer> itr = list.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
			itr.remove();
		}
		System.out.println(list);
	}
}
