
public class NonStaticMember {
     int a;                 // Non Static Variable
     NonStaticMember(){     //Constructor
    	 System.out.println("Constructor");
     }
     {
    	 System.out.println("Non static Block");  //Non Static Block
     }
	public static void main(String[] args) {
		System.out.println("Inside main");
		NonStaticMember obj =  new NonStaticMember(); //here also non-static and constructor is called
		System.out.println(obj.a);
		new NonStaticMember();    // calling non-static And constructor
        new NonStaticMember();    // calling non-static And constructor 2nd time
	}

}
