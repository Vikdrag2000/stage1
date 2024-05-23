package AdventureAscent;
import java.util.*;
public class TrekkingDetailsMain {
	private Map<String,Integer> detailsMap= new HashMap<>();
	
	public Map<String,Integer> getDetaiksMap(){
		return detailsMap;
	}
	
	public void setDetaiksMap(Map<String,Integer> d) {
		this.detailsMap=d;
	}
	
	public 	int findCountOfMountainsBasedOnThePeakPoint(int minimumPeak, int maximumPeak) {
		int count =0;
		for(String s: detailsMap.keySet()) {
			if(detailsMap.get(s)>=minimumPeak && detailsMap.get(s)<=maximumPeak) {
				count+=1;
			}
		}
		return count;
	}

	public List<String> findMountainsBasedOnPeakPoint(int peakPoint){
		List<String> list = new ArrayList<>();
		for(String s: detailsMap.keySet()) {
			if(detailsMap.get(s)<=peakPoint) {
				list.add(s);
			}
		}
		return list;
	}


	public static void main(String[] args) {
     Scanner sc = new Scanner(System.in);
     System.out.println("Enter number of details to be added");
     int a = sc.nextInt();
     System.out.println("Enter the details (Mountain name: Peak point");
     TrekkingDetailsMain tm = new TrekkingDetailsMain();
//     String s[] = new String[a];
     for(int i=0;i<a;i++) {
    	String s[]=sc.next().split(":");
    	tm.detailsMap.put(s[0],Integer.parseInt(s[1]));
    	 
     }
	
     System.out.println("Enter the minimum and maximum peak points");
     int a2 = sc.nextInt();
     int a3 = sc.nextInt();
     int cn=tm.findCountOfMountainsBasedOnThePeakPoint(a2, a3);
     if(cn>0) {
     System.out.println("The total count of mountains are "+cn);
     }else {
    	 System.out.println("No mountains were found"); 
     }
     System.out.println("Enter the peak point to be searched");
     int a4 = sc.nextInt();
     System.out.println("Mountains based on the condition are");
     List<String> list = tm.findMountainsBasedOnPeakPoint(a4);
     if(list.size()==0) {
    	 System.out.println("No Mountains were found"); 
     }else {
    	 for(String i: list) {
    		 System.out.println(i); 
    	 }
     }
	}

}
