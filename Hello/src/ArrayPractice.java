
public class ArrayPractice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      int arr[] = new int[5];
      arr[0]=7;
      arr[1]= new Integer(6);
      for(int i=0;i<arr.length;i++) {
    	  System.out.println(arr[i]);
      }
      for(int element : arr) {
    	  System.out.println(element);
      }
	}

}
