package DDRElectronicManagement;
import java.util.*;
public class BatteryMain {
	private Map<String,Integer> batteryNameMap = new HashMap<>();
	
	public static void main(String[] args) {
           Scanner sc = new Scanner(System.in);
           System.out.println("Enter number of records to be added:");
           int a = sc.nextInt();
           sc.nextLine();
           BatteryMain ob = new BatteryMain();
           for(int i=0;i<a;i++) {
        	   String s[]= sc.nextLine().split(":");
        	   ob.batteryNameMap.put(s[0], Integer.parseInt(s[1]));
           }
           System.out.println("Enter the battery name needs to be searched");
           String s2= sc.nextLine();
           float f= ob.findWattPowerBasedOnBatteryName(s2);
           if(f>0) {
           System.out.println("The watt power of the battery "+s2+ " is "+(int)f);
           }else {
               System.out.println(s2+" is an invalid battery name");
           }
           System.out.println("Batteries with the highest watt power are:");
           List<String> list = ob.findHighestWattBatteries();
         
        	   for(String i: list) {
        		   System.out.println(i);  
        	   }
           
	}
	public float findWattPowerBasedOnBatteryName(String batteryName) {
		
		for(String i: batteryNameMap.keySet()) {
			if(i.equalsIgnoreCase(batteryName)) {
				return batteryNameMap.get(i);
			}
		}
		return -1;
	}
	public List<String> findHighestWattBatteries(){
		List<String> list = new ArrayList<>();
		float x =0;
		for(String i: batteryNameMap.keySet()) {
			if(batteryNameMap.get(i)>x) {
				x=batteryNameMap.get(i);
			}
		}
		for(String i: batteryNameMap.keySet()) {
			if(batteryNameMap.get(i)==x) {
				list.add(i);
			}
		}
		return list;
	}
}
