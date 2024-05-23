package Scores;

public class UserMainCode {

	public static boolean checkScores(int arr[]) {
		int a=0;
		for(int i=0;i<arr.length;i++) {
			if(i==(arr.length-1)) {
				break;
			}
			if(arr[i]==100 && arr[i+1]==100) {
				return true;
			}
		}
		return false;
	}
}
