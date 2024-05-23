package Appdetails;
import java.util.*;
public class AppInfoMain {
	private Map<String,Double> appMap = new HashMap<>();
	
	public double findAppRating(String appName) {
		double rating=0;
		for(String s: appMap.keySet()) {
			if(s.equalsIgnoreCase(appName)) {
				return appMap.get(s);
			}
		}
		return -1;
	}
	public List<String> findAppsWithLowRating() {
		List<String> list = new ArrayList<>();
		for(String s: appMap.keySet()) {
			if(appMap.get(s)<=3) {
				list.add(s);
			}
		}
		return list;
	}
	public static void main(String[] args) {
     Scanner sc = new Scanner(System.in);
     System.out.println("Enter number of records to be added:");
     int s=sc.nextInt();
     sc.nextLine();
     System.out.println("Enter the details (App name : rating):");
     AppInfoMain am = new AppInfoMain();
     for(int i=0;i<s;i++) {
    	 String s2[] = sc.nextLine().split(":");
    	 am.appMap.put(s2[0], Double.parseDouble(s2[1]));	 
     }
     System.out.println("Enter the app name to be searched");
     String s3 = sc.next();
     double s4 = am.findAppRating(s3);
     if(s4>0) {
     System.out.println("Rating of picsart app is "+s4);
     }else {
    	 System.out.println(s3+" is an invalid app name");
     }
     
     List<String> list = am.findAppsWithLowRating();
     if(list.size()>0) {
    	 System.out.println("Apps with low rating are");
	     for(String i: list) {
	    	 System.out.println(i); 
	     }
     }else {
    	 System.out.println("No apps were found with a low rating");
     }
     
		
	}

}
