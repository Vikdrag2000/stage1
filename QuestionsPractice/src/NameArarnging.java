import java.util.*;
public class NameArarnging {

	public static void main(String[] args) {

		Scanner sc =new Scanner(System.in);
		System.out.println("Enter Your name");
		String name = sc.nextLine();
		
		String arr[] = name.split(" ");
		char arr3[] = new char[arr.length-1];
		String last="";
		for(int i =0;i<arr.length;i++) {
			if(i==(arr.length-1)) {
				last += arr[i];
			}
			else{
			arr3[i] = arr[i].charAt(0);
			}
		}
		String val="";
		for(int i=(arr3.length-1);i>=0;i--) {
			if(i<(arr3.length-1)) {
				val+= "."+arr3[i];
			}
			else{
			val+= arr3[i];
			}
		}
		System.out.println(last+" "+val);
	}
	

}
