package Maps;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class HashMapDemo {

	public static void main(String[] args) {

		Map<String,Integer> map = new HashMap<>();
		map.put("Vikash", 91);
		map.put("Rock", 98);
		map.put("soman", 99);
		map.put("Loath", 97);
		Set<String> keyset = map.keySet();
		System.out.println("Key:"+keyset);
		
		Collection<Integer> val = map.values();
		System.out.println("Values:"+val);
		
		for(String key: keyset) {
			System.out.println("Key:"+key+" Value:"+map.get(key));
		}
	}

}
