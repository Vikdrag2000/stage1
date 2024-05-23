package SportsClub;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeMap;
import java.util.TreeSet;

public class Athlete2 {
      private Map<String,Double> atheleteMap = new HashMap<>();
      
      public List<String> findBestPerformance(){     //by minimum  3 times taken
 		 List<String> list = new ArrayList<>();
 		 
 		 Set<Double> set = new TreeSet<>();
 		
 		 for(String d: atheleteMap.keySet()) {
 			 set.add(atheleteMap.get(d));
 		 }
// 		 for(Double d: set) {
// 			 System.out.println(d);
// 		 }
 		 
 		List<Double> list2 = new ArrayList<>(set);
 		for(int i=0;i<3;i++) {
 			double a=list2.get(i);
 		    for(String d: atheleteMap.keySet()) {
 		    	//System.out.println(d+" "+atheleteMap.get(d) + "<=>"+ list2.get(i));
 		    	if(list.size()==3) {
 		    		return list;
 		    	}
	 			 if(atheleteMap.get(d) == (a)) {
	 				 list.add(d);
	 				 
	 			 }
 			 }	  //System.exit(0);
 		 }
 		 return list;
 	 }
      
	public static void main(String[] args) {

		 Scanner sc = new Scanner(System.in);
	       Athlete2 ob = new Athlete2();
	       System.out.println("Enter the no of Athlete");
	       int a = sc.nextInt();
	       System.out.println("Enter the Athlete details(AtheleteName: Time Taken)");
	       for(int i=0;i<a;i++) {
	    	   String s[]= sc.next().split(":");
	    	   ob.atheleteMap.put(s[0],Double.parseDouble(s[1]));
	       }
	      // System.out.println(ob.atheleteMap.keySet().size());
	       List<String> list = ob.findBestPerformance();
	       //System.out.println(list.size());
	       if(list.size()>0) {
	    	   System.out.println("best Perfomer are");
	    	   for(String s2: list) {
	    		   System.out.println(s2); 
	    	   }
	       }
	}

}
