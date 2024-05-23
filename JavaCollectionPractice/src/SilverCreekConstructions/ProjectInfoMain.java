package SilverCreekConstructions;
import java.util.*;
public class ProjectInfoMain {
	 private Map<String,String> projectMap = new HashMap<>();
	 
	 public int findTheCountOfProjectsBasedOnTheConstructionType(String constructionType) {
		 int cn =0;
		 for(String i: projectMap.keySet()) {
			 if(projectMap.get(i).equalsIgnoreCase(constructionType)) {
				 cn+=1;
			 }
		 }
		 if(cn>0) {
			 return cn;
		 }
			 return -1;
	 }

	 public List<String> findProjectIdsBasedOnTheConstructionType(String constructionType){
		 List<String> list = new ArrayList<>();
		 for(String i: projectMap.keySet()) {
			 if(projectMap.get(i).equalsIgnoreCase(constructionType)) {
				 list.add(i);
			 }
		 }
		 return list;
	 }
	
	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number of projects to be added");
        int a = sc.nextInt();sc.nextLine();
        System.out.println("Enter the project (Project Id: Construction type)");
        ProjectInfoMain ob = new ProjectInfoMain();
        for(int i=0;i<a;i++) {
        	String s[]= sc.nextLine().split(":");
        	ob.projectMap.put(s[0], s[1]);
        }
        System.out.println("Enter the Construction type to be searched");
        String s2 = sc.nextLine();
        int a2= ob.findTheCountOfProjectsBasedOnTheConstructionType(s2);
        if(a2>0) {
        	System.out.println("The projects based on "+s2+" are "+a2);
        }else {
        	System.out.println("No projects were found for "+s2);
        }
		
        System.out.println("Enter the Construction type to identify the Projects Ids");
        String s3 = sc.nextLine();
        List<String> list = ob.findProjectIdsBasedOnTheConstructionType(s3);
        if(list.size()>0) {
        	System.out.println("Projects based on the "+s3+" are ");
        	for(String s: list) {
        		System.out.println(s);	
        	}
        }else {
        	System.out.println("No Projects Ids were found for the "+s3);
        }
	}

}
