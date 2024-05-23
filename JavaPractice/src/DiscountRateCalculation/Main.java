package DiscountRateCalculation;
import java.util.*;
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		Map<String,String> map = new LinkedHashMap();
		Map<String,Integer> map2 = new LinkedHashMap();
		int a = sc.nextInt();sc.nextLine();
		for(int i=0;i<a;i++) {
			String s = sc.next();
			map.put(s,sc.next());
			map2.put(s,sc.nextInt());
		}
		
	List<String> arr =UserMainCode.calculateDiscount(map, map2);
	for(String i: arr) {
		System.out.println(i);
	}
	}

}
