package WordCount;

public class UserMainCode {

	public static int wordCount(String arr[],int a) {
		int b=0;
		for(String i: arr) {
			if(i.length()==a) {
				b+=1;
			}
		}
		
		return b;
	}
}
