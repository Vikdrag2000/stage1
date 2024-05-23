package CollectionsPart;
import java.util.Arrays;
public class ArraysSort {

	public static void main(String[] args) {

		int a[]= {10,40,20,3};
		for(int i: a) {
			System.out.println("Before Sorted:"+i);			
		}
		Arrays.sort(a);
		for(int i: a) {
			System.out.println("After Sorted:"+i);			
		}
	}

}
