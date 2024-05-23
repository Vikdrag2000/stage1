
package Generics;
import java.util.*;

public class GenricsClass<T> {
	T obj;
	
//	public GenricsClass(T obj){
//		this.obj=obj;
//	}
	public T getObj() {
		return obj;
	}
	public void setObj(T obj) {
		this.obj = obj;
	}
	public void displayObjectDetails() {
		System.out.println("The type of Object:"+obj.getClass().getName());
	}
	public T getObject() {
		return obj;
	}
	
	public static void main(String[] args) {
		GenricsClass<Integer> genr= new GenricsClass<>();
		genr.setObj(10);
		System.out.println(genr.getObj());
		
		GenricsClass<String> genr2= new GenricsClass<>();
		genr2.setObj("Vikash");
		System.out.println(genr2.getObj());
	}

}
