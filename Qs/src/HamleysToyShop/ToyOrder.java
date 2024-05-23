package HamleysToyShop;
import java.util.*;
public class ToyOrder {
     Map<String,Integer> map = new HashMap<>();
	public static void main(String[] args) {
        ToyOrder to = new ToyOrder();
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number");
		int a = sc.nextInt();sc.nextLine();
		System.out.println("ToyName : Quantity");
		for(int i=0;i<a;i++) {
			String s[] = sc.nextLine().split(":");
			to.map.put(s[0],Integer.parseInt(s[1]));
		}
		System.out.println("Enter the toy Name");
		String s = sc.next();
		int a2 = to.findQuantity(s);
		if(a2>0) {
			System.out.print(a2);	
		}
		int a3 = sc.nextInt();
		List<String> list = to.findToysBasedOnTheGivenQuantity(a);
		if(list.size()>0) {
			for(String i: list) {
				System.out.println(i);	
			}
		}
	}

	public int findQuantity(String toyName) {
		for(String s: map.keySet()) {
			if(s.equalsIgnoreCase(toyName)) {
				return map.get(s);
			}
		}
		return 0;
	}
	
	public List<String> findToysBasedOnTheGivenQuantity(int quantity){
		List<String> res = new ArrayList<>();
		for(String s: map.keySet()) {
			if(map.get(s)<=quantity) {
			   res.add(s);
			}
		}
		return res;
	}
}
