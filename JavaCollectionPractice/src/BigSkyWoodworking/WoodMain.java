package BigSkyWoodworking;
import java.util.*;
public class WoodMain {

	 private Map<String,String> woodMap = new HashMap<>();
	 
	 public int findCountOfOrderIdsBasedOnTheWoodType(String woodType) {
		 int cn =0;
		 for(String i: woodMap.keySet()) {
			 if(woodMap.get(i).equalsIgnoreCase(woodType)) {
				 cn+=1;
			 }
		 }
		 if(cn>0) {
			 return cn;
		 }
		 return -1;
	 }
	 
	 public  List<String> findOrderIdsBasedOnTheWoodType(String woodType){
		 List<String> list = new ArrayList<>();
		 for(String i: woodMap.keySet()) {
			 if(woodMap.get(i).equalsIgnoreCase(woodType)) {
				list.add(i);
			 }
		 }
		 return list;
	 }

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number of records to be added");
		int a = sc.nextInt();
		WoodMain wm = new WoodMain();
		System.out.println("Enter the records (Order Id: Wood Type)");
		for(int i=0;i<a;i++) {
			String a2[]= sc.next().split(":");
			wm.woodMap.put(a2[0], a2[1]);			
		}
		System.out.println("Enter the Wood type to be searched");
		String a3 = sc.next();
		int a4 = wm.findCountOfOrderIdsBasedOnTheWoodType(a3);
		if(a4>0) {
			System.out.println("The Order Ids based on "+a3+" are "+a4);
		}else {
			System.out.println("No Order Ids were found for "+a3);
		}
		System.out.println("Enter the Wood type to identify the Order Ids");
		String a5 = sc.next();
		List<String> list = wm.findOrderIdsBasedOnTheWoodType(a5);
		if(list.size()>0) {
			System.out.println("Order Ids based on the "+a5+" are");
			for(String i: list) {
				System.out.println(i);
			}
		}
		else {
			System.out.println("No Order Ids were found for the "+a5);
		}
	}

}
