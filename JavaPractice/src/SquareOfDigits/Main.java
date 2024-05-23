package SquareOfDigits;
import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     Scanner sc = new Scanner(System.in);
     int a = sc.nextInt();
     System.out.print(getSumOfSquaresOfDigits(a));
		
	}

	public static int getSumOfSquaresOfDigits(int a) {
		String s = Integer.toString(a);
		String arr[] = s.split("");
		int a2=0;
		for(int i=0;i<s.length();i++) {
			a2+= Integer.parseInt(arr[i])*Integer.parseInt(arr[i]);
		}
		return a2;
		//System.out.print(Math.pow('7',2));
	}
}
