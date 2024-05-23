
public class RunTime {
   public static void main(String[] args){
	   Apple m = new MacBook();
	   m.start();
	   m.shutDown();
	   
	   Apple m2 = new MacBookPro();
	   m2.start();
	   m2.shutDown();
	   
	   Apple m3 = new MacBookAIR();
	   m3.start();
	   m3.shutDown();
	   
	   MacBook cp = new MacBookPro();
	   System.out.println(cp.a);
	   MacBook ca = new MacBookAIR();
	   System.out.println(cp.a);
   }
}
