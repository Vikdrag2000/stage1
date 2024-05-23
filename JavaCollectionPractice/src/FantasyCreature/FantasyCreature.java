package FantasyCreature;
import java.util.*;

public class FantasyCreature {
	 private Map<String,Integer> fantasyCreatureMap= new HashMap<>();

	 public  int findTheHitPointsForTheGivenCreature(String creature) {
		 for(String i: fantasyCreatureMap.keySet()) {
			 if(i.equals(creature)) {
				 return fantasyCreatureMap.get(i);
			 }
		 }
		 
		 return -1;
	 }
	 public List<String>findTheCreatureNamesBasedOnTheHitpoints(){
		 List<String> list = new ArrayList<>();
		 for(String i: fantasyCreatureMap.keySet()) {
			 if(fantasyCreatureMap.get(i)>=80) {
				 list.add(i);
			 }
		 }
		 return list;
	 }
	public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
       System.out.println("Enter number of creatures to be added");
       int a = sc.nextInt();
       sc.nextLine();
       System.out.println("Enter the creatures (CreatureName: HitPoints)");
       FantasyCreature ob = new FantasyCreature();
       for(int i=0;i<a;i++) {
    	   String s[]= sc.nextLine().split(":");
    	   ob.fantasyCreatureMap.put(s[0],Integer.parseInt(s[1]));
       }
       System.out.println("Enter the fantasy creature name");
       String s2 = sc.nextLine();
       int a2 = ob.findTheHitPointsForTheGivenCreature(s2);
       if(a2>0) {
    	   System.out.println("The Hit Points for the "+s2+" is "+a2);  
       }
       else {
    	   System.out.println("No fantasy creature were found");

       }
		
       List<String> list = ob.findTheCreatureNamesBasedOnTheHitpoints();
       if(list.size()>0) {
    	   System.out.println("Fantasy Creatures based on the condition are");
    	   for(String s: list) {
    		   System.out.println(s);  
    	   }
    	   
       }else {
    	   System.out.println("No fantasy creature were found for the given condition");  
       }
	}

	
}
