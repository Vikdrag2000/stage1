
public class ArrayFiveWithZero {

	public static void main(String[] args) {
		
		int[] arr = {4,3,5,3,6,3,5,7,5};
		for(int i=0;i<arr.length;i++) {
			if(arr[i]==3 && arr[i+1]==5) {
				arr[i+1]=0;
			}
		}
		for(int i: arr) {
			System.out.print(i+" ");
		}

	}

}
