
public class WrapperCLass {
    int a;
    String d;
    WrapperCLass(int a){
    	this.a=a;
    }
	
	public static void main(String[] args) {
    int b;
    WrapperCLass obj = new WrapperCLass(7);
    System.out.println(obj.a);
    
    Integer i = new Integer(3);
    System.out.println(i);
    
	}

}
