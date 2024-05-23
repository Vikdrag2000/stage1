package GradeCalculator1;
import java.util.*;
public class UserCodeMain {

	public static LinkedHashMap<String,String> calculateGrade
	(LinkedHashMap<String,Double> map){
  LinkedHashMap<String,String> map2 = new LinkedHashMap<>();
		for(String s: map.keySet()) {
			if(map.get(s)>=60) {
				map2.put(s,"PASS");
			}
			else {
				map2.put(s,"FAIL");
			}
		}
		return map2;
	}
}
