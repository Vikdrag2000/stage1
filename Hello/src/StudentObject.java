
public class StudentObject {
	int id;
	String name;
	
	public boolean upadateName(String newName) {
		name = newName;
		return true;
	}
   public static void main(String[] args) {
	   StudentObject so = new StudentObject();
	   so.id=45;
	   so.name="Vikahs";
	   System.out.println("Old Name: "+so.name);
	   so.upadateName("Vikash");
	   System.out.println("New Name: "+so.name);
   }
}
