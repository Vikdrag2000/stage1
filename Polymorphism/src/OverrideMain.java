
public class OverrideMain {

	public static void main(String[] args) {
      System.out.println("Default Main");
      int[] arr= {5,6};
      main(arr);
      }
	public static void main(int[]rgs) {
		System.out.println(rgs[0]+rgs[1]);
	}

}
