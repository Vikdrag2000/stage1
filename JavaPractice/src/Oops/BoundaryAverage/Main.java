package Oops.BoundaryAverage;
import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int a2[]= new int[a];
        for(int i=0;i<a;i++) {
        	a2[i]= sc.nextInt();
        	if(a2[i]>10) {
        		System.exit(0);
        	}
        }
        System.out.print(UserMainCode.getBoundaryAverage(a2));
	}

}
