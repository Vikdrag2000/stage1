package Allaboutyou;
import java.util.*;
public class MemberMain {
	private Map<String,String> memberMap = new HashMap<>();
	
	public Map<String,String> getMemberMap(){
		return memberMap;
	}
	
	public void setMemberMap(Map<String,String> map) {
		this.memberMap=map;
	}

	public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      System.out.println("Enter number of records to be added:");
      int a = sc.nextInt();
      MemberMain mm = new MemberMain();
      System.out.println("Enter the details (Member id : Member type):");
      for(int i=0;i<a;i++) {
    	  String b=sc.nextLine();
    	  String s[] = b.split(":");
    	  mm.memberMap.put(s[0], s[1]);
      }
      System.out.println("Enter the member id to be searched");
      String a2 = sc.next();
      String a3 =mm.findMemberTypeOfGivenMemberId(a2);
      if(a3.equals("Invalid member id")) {
    	  System.out.println("Invalid member id"); 
      }else {
    	  System.out.println(a2+ " is a "+a3+" member");
      }
		
      System.out.println("Enter the member type to be searched");
      String a4 = sc.next();
      
      List<String> list = mm.findMemberIdsBasedOnTheMemberType(a4);
      if(list.size()==0) {
    	  System.out.println("No members were found for the given member type");
      }else {
    	  System.out.println("Member ids of Platinum members are");
    	  for(String i: list) {
    		  System.out.println(i); 
    	  }
      }
	}

	public String findMemberTypeOfGivenMemberId(String memberId) {
		for(String s: memberMap.keySet()) {
			if(s.equals(memberId)) {
				return memberMap.get(s);
			}
		}
		return "Invalid member id" ;
	}
	
	public List<String> findMemberIdsBasedOnTheMemberType(String memberType){
		List<String> list = new ArrayList<>();
		for(String s: memberMap.keySet()) {
			if(memberMap.get(s).equalsIgnoreCase(memberType)) {
				list.add(s);
			}
		}
		return list;
	}


}
