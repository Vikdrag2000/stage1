
public class ArrayIndexDemo {

	public static void main(String[] args) {

		int arr[] = {3,4,5,6};
		try {
			System.out.println("Elements of Array are");
			for(int i=0;i<=arr.length;i++) {
				System.out.println(arr[i]);
			}
		}
		catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("Index beyond Araay Length");
		}
		System.out.println("Completed");
		
	}
	void method() {
		System.out.print(9);
	}

}
