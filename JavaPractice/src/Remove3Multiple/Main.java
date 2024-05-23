package Remove3Multiple;
import java.util.*;
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     Scanner sc = new Scanner(System.in);
     int a= sc.nextInt();
     int arr[] = new int[a];
     for(int i=0;i<a;i++) {
           arr[i] = sc.nextInt();
    	
     }
     ArrayList<Integer> list = new ArrayList<>();
     for(int i: arr) {
     	   list.add(i);	
      }
     list=UserMainCode.removeMultiplesOfThree(list);
     for(Integer i: list) {
    	 System.out.println(i);
     }
     
	}

}
