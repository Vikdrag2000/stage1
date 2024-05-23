package Set;

import java.util.TreeSet;

public class NavigableTreeSetDemo {

	public static void main(String[] args) {

		TreeSet<Integer> set = new TreeSet<>();
		for(int i=10;i<=50;i+=10) {
			set.add(i);
		}
		System.out.println(set);
		System.out.println(set.ceiling(30));
		System.out.println(set.higher(30));
		System.out.println(set.floor(20));
		System.out.println(set.lower(20));
		System.out.println(set.pollFirst());
		System.out.println(set.pollLast());
		System.out.println(set.descendingSet());
		System.out.println(set);
	}

}
