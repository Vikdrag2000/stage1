package instance;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class employee {

	public static void main(String[] args) {
		
		List<Integer> list = new ArrayList<>(Arrays.asList(20,25,30,40));
		System.out.println(list);
		List<Integer> list2 = list.stream().filter(i-> i >= 30).collect(Collectors.toList());
		System.out.println(list2);
	}
}
