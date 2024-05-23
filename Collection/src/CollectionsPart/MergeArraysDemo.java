package CollectionsPart;

import java.util.*;

public class MergeArraysDemo {

	public static void main(String[] args) {
    String[]  s = {"A","B","C"};
    String[]  s1 = {"D","E","F"};
    
    List<String> list1 = new ArrayList<>(Arrays.asList(s));
    list1.addAll(Arrays.asList(s1));
    System.out.println(list1);


    
// For merging Two List from Array [Part B]
    List<String> list = Arrays.asList(s);
    System.out.println(list);
    List<String> list2 = Arrays.asList(s1);
    List<String> merge = new ArrayList<>(list);
    merge.addAll(list2);
    System.out.println(merge);
	}

}
