package Set;

import java.util.Set;
import java.util.TreeSet;

public class StringTreeSet {
  public static void main(String[] args) {
	Set<String> set = new TreeSet<>();
	set.add("xyz");
	set.add("cde");
	set.add("opq");
	
	for(String ob: set) {
		System.out.println(ob);   // elements sorted in a Alphabetic
	}
}
}
