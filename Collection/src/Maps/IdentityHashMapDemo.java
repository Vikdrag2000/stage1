package Maps;
import java.util.*;

public class IdentityHashMapDemo {

	public static void main(String[] args) {

		Map<Integer,String> map = new HashMap<>();
		Map<Integer,String> map2 = new IdentityHashMap<>();
		
		Integer a = new Integer(19);
		Integer b = new Integer(19);
		int a1 =4;
		int b1 =4;
		
		map.put(a, "Vikash");
		map.put(b,"Shy");
		
		map2.put(a, "Vikash");
		map2.put(b,"Shy");
		
		System.out.println(map);
		System.out.println(map2);

		
	}

}
