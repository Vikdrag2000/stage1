package GradeCalculator1;
import java.util.Scanner;
import java.util.LinkedHashMap;
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		LinkedHashMap<String,Double> map = new LinkedHashMap<>();
		int no = sc.nextInt();
		for(int i=0;i<no;i++) {
			map.put(sc.next(), sc.nextDouble());
		}
		LinkedHashMap<String,String> map2 =UserCodeMain.calculateGrade(map);
		for(String key: map2.keySet()) {
			System.out.println(key);
			System.out.println(map2.get(key));
		}
	}

}
