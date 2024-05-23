package Set;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Random;
import java.util.Set;
import java.util.TreeSet;

public class HashSet2 {

	public static void main(String[] args) {

		Random rn = new Random();
		
		HashSet<Integer> set = new HashSet<>();
		LinkedHashSet<Integer> set2= new LinkedHashSet<>();
		Set<Integer> set3= new TreeSet<>();
		for(int i=0;i<10;i++) {
			int num = rn.nextInt(10);
			set.add(num);
			set2.add(num);
			set3.add(num);
			System.out.print(num);
		}
		System.out.println();
		System.out.println("HashSet:"+set);
		System.out.println("LinkedHashSet:"+set2);
		System.out.println("TreeSet:"+set3);
		
	}

}
