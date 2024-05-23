package LengthOfWord;

public class UsermainCode {

	public static int compareLastWord(String s){
		int length =0;
		String arr[] = s.split(" ");
		if(arr[0].equalsIgnoreCase(arr[arr.length-1])) {
			length = arr[0].length();
		}
		else {
			length= arr[0].length()+arr[arr.length-1].length();
		}
		
		return length;
		
	}
}
