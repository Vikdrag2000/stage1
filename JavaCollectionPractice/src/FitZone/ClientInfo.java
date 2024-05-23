package FitZone;
import java.util.*;
public class ClientInfo {
	private Map<String,String> clientMap=new HashMap<>();

	public int findTotalCountOfClientsBasedOnPackageName (String packageName) {
		int cn=0;
		for(String s: clientMap.keySet()) {
			if(clientMap.get(s).equalsIgnoreCase(packageName)) {
				cn+=1;
			}
		}
		if(cn>0) {
			return cn;
		}
		return -1;
	}
	public List<String> searchClientIdsByPackageName(String packageName){
		List<String> list = new ArrayList<>();
		for(String s: clientMap.keySet()) {
			if(clientMap.get(s).equalsIgnoreCase(packageName)) {
				list.add(s);
			}
		}
		return list;
	}
	public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
       System.out.println("Enter number of clients to be added");
       int a = sc.nextInt();
       sc.nextLine();
       System.out.println("Enter the client details (Client Id: Package Name)");
       ClientInfo ob = new ClientInfo();
       for(int i=0;i<a;i++) {
    	   String s[] = sc.nextLine().split(":");
    	   ob.clientMap.put(s[0], s[1]);
       }
       System.out.println("Enter the package name to find the total count of clients");
       String s2 = sc.nextLine();
       int a2 = ob.findTotalCountOfClientsBasedOnPackageName(s2);
       if(a2>0) {
    	   System.out.println("Total number of clients with package name "+s2+" is "+a2);
       }else {
    	   System.out.println("No clients found with package name "+s2);
       }
       System.out.println("Enter the package name to search for client Ids");
       String s3 = sc.nextLine();
       List<String> list = ob.searchClientIdsByPackageName(s3);
       if(list.size()>0) {
    	   System.out.println("Client Ids based on package name "+s3);
    	   for(String st: list) {
    		   System.out.println(st); 
    	   }
    	   
       }else {
    	   System.out.println("No clients found with package name "+s3); 
       }
	}

}
