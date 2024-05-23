package ComparatorDemo;

import java.util.Set;
import java.util.TreeSet;

public class StringTreeSet {

	public static void main(String[] args) {

		Set<String> set = new TreeSet<>(new StringComparator());
		set.add("adbdgsf");
		set.add("rty");
		set.add("poiuy");
		
		
		for(String i: set) {
			System.out.println(i);
		}
	}

}
