package SportsClub;
import java.util.*;
public class Athelete {
     private Map<Double,String> atheleteMap = new HashMap<>();
	
	 public double findTimeTaken(String name) {
		 for(Double d: atheleteMap.keySet()) {
			 if(atheleteMap.get(d).equalsIgnoreCase(name)) {
				 return d;
			 }
		 }
		 return -1;
	 }
     
	 public List<String> findThreeBestPerformance(){
		 List<String> list = new ArrayList<>();
		 Map<Double,String> atheleteMap2 = new TreeMap<>(atheleteMap);
		 
		 for(Double d: atheleteMap2.keySet()) {
			 list.add(atheleteMap2.get(d));
			 if(list.size()==3) {
				 break;
			 }
		 }
		 return list;
	 }
	 
	public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
       Athelete ob = new Athelete();
       System.out.println("Enter the no of Athlete");
       int a = sc.nextInt();
       System.out.println("Enter the Athlete details(Time Taken: AtheleteName)");
       for(int i=0;i<a;i++) {
    	   String s[]= sc.next().split(":");
    	   ob.atheleteMap.put(Double.parseDouble(s[0]), s[1]);
       }
       System.out.println("Enter the Athlete name");
       String s =sc.next();
       double d = ob.findTimeTaken(s);
       if(d>0) {
    	   System.out.println("Time taken by "+s+" is "+d);
    	   
       }
       List<String> list = ob.findThreeBestPerformance();
       if(list.size()>0) {
    	   System.out.println("3 best Perfomer are");
    	   for(String s2: list) {
    		   System.out.println(s2); 
    	   }
       }
	}

}
