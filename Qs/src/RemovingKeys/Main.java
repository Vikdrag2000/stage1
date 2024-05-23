package RemovingKeys;
import java.util.*;
public class Main {

	public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      int a = sc.nextInt();
      HashMap<Integer,String>  map = new HashMap<>();
      for(int i=0;i<a;i++) {
    	  int a2=sc.nextInt();sc.nextLine();
    	  String a3=sc.nextLine();
    	  map.put(a2,a3);
      }
		System.out.println(UserMainCode.sizeofResultandHashMap(map));
	}

}
class UserMainCode{
	public static int sizeofResultandHashMap(HashMap<Integer,String>  map){
//	for(Integer i: map.keySet()) {
//			if(i%4==0) {
//				map.remove(i);
//			}
//		}
	map.entrySet().removeIf(i->i.getKey() %4==0);
		return map.size();
	}
}