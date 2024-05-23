package Entity;

public class Parent {
     Parent(){
    	 System.out.println("Memory parent address: "+this);
     }
	public static void main(String[] args) {

	}
	public static void prt() {
		System.out.println("Parent");
	}
	void prt2() {
		System.out.println("Super parent");
	}

}
