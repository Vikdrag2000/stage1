package Generics;

public class MyArray<T> {
	private T arr[] = (T[])new Object[10];
	int length=0;
	
	public void append(T v) {
		arr[length++]=v;
	}
	
	public void display() {
		for(int i=0;i<length;i++) {
			System.out.println(arr[i]);
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      MyArray<Integer> ob = new MyArray<>();
      ob.append(10);
      ob.append(100);
      ob.append(1000);
      ob.display();
	}

}
