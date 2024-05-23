package Set;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Random;
import java.util.Set;

public class HASHSET {

	public static void main(String[] args) {

		Random rn = new Random();
		
		List<Integer> list = new ArrayList<>();
		
		for(int i=0;i<10;i++) {
			list.add(rn.nextInt(5));
		}
		System.out.println("List:"+list);
		
		Set<Integer> set = new HashSet<>(list); // here HashSet remove duplicate value
		System.out.println("Set:"+set);
	}

}
