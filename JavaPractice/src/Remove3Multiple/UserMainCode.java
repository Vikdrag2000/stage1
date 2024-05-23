package Remove3Multiple;
import java.util.ArrayList;

public class UserMainCode {
	
	public static ArrayList<Integer> removeMultiplesOfThree(ArrayList<Integer> list) {
		ArrayList<Integer> list2 = new ArrayList<>();
		int a=0;
		for(Integer i: list) {
			if((a+1)%3==0) {
				
			}
			else {
				list2.add(i);
			}
			a++;
		}
		return list2;
	}

}
