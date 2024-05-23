package Entity;

public class Child extends Parent{
	 Child(){
   	 System.out.println("Memory child address: "+this);
    }
	public static void main(String[] args) {
		
	}
   public static void chld() {
	   System.out.println("Child");
	   
	   }
   void prt2() {
	  
	   System.out.println("Child Super");
	   super.prt2();
   }
}
