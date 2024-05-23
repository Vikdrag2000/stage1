import java.util.stream.*;
import java.util.*;
public class MapString {

	public static void main(String[] args) {

		List<String> list = new ArrayList<>();
		list.add("Vikash");
		list.add("Vikash");
		list.add("Vikash");
		System.out.println(list);
		List<String> l= list.stream().
				        map(s->s.toLowerCase()).
				        collect(Collectors.toList());
		System.out.println(l);
	}

}
