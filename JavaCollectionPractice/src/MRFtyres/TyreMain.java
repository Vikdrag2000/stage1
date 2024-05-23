package MRFtyres;
import java.util.*;
public class TyreMain {
	private Map<String,String> tyreMap= new HashMap<>();
	
	 public int findCountOfOrderIdsBasedOnTheTyreType(String tyreType) {
		 int cn=0;
		 for(String s: tyreMap.keySet()) {
			 if(tyreMap.get(s).equalsIgnoreCase(tyreType)) {
				 cn+=1;
			 }
		 }
		 if(cn>0) {
			 return cn;
		 }
		 return -1;
	 }
	 
	 public List<String> findOrderIdsBasedOnTheTyreType(String tyreType){
		 List<String> list= new ArrayList<>();
		 for(String i: tyreMap.keySet()) {
			 if(tyreMap.get(i).equalsIgnoreCase(tyreType)) {
				list.add(i);
			 }
		 }
		 return list;
	 }

	
	public static void main(String[] args) {

		Scanner sc =  new Scanner(System.in);
		System.out.println("Enter number of records to be added");
		int a = sc.nextInt();
		sc.nextLine();
		System.out.println("Enter the records (Order Id: Tyre Type)");
		TyreMain ob = new TyreMain();
		for(int i=0;i<a;i++) {
			String s[] = sc.nextLine().split(":");
			ob.tyreMap.put(s[0],s[1]);
		}
		System.out.println("Enter the Tyre type to be searched");
		String s2 = sc.nextLine();
		int a2 = ob.findCountOfOrderIdsBasedOnTheTyreType(s2);
		if(a2>0) {
			System.out.println("The Order Ids based on "+s2+" are "+a2);
		}else {
			System.out.println("No Order Ids were found for "+s2);
		}
		System.out.println("Enter the Tyre type to identify the Order Ids");
		String s3= sc.nextLine();
		List<String> lis = ob.findOrderIdsBasedOnTheTyreType(s3);
		if(lis.size()>0) {
			System.out.println("Order Ids based on the "+s3+" are");	
			for(String i: lis) {
				System.out.println(i);
			}
		}else {
			System.out.println("No Order Ids were found for the "+s3);
		}
		
	}

}
