package unlocktofuture;
import java.util.*;
public class UserInterface {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the details");
		String s = sc.next();
		Lock ob = extractDetails(s);
		if(ob.getLockState().equalsIgnoreCase("Unlocked")) {
			int a[]= new int[ob.getCodeLength()];
			String s2 = ob.enterCodeToUnLock(a);
			System.out.println(s2);
		}
		else {
				System.out.println("Enter the code attempts of length "+ob.getCodeLength());
				int a[] = new int[ob.getCodeLength()];
				for(int i=0;i<a.length;i++) {
					a[i]= sc.nextInt();
				}
				String s2 = ob.enterCodeToUnLock(a);
				if(ob.getLockState().equalsIgnoreCase("locked")){
					System.out.println(s2);
				}
				else {			
				
				System.out.println("Lock Model: "+ob.getLockModel());
				System.out.println("Code Length: "+ob.getCodeLength());
				System.out.println("Lock State "+ob.getLockState());
				System.out.println(s2);
				}
		}
	}

	public static Lock extractDetails(String lockDetails) {
		String s[] = lockDetails.split(":");
		int a = Integer.parseInt(s[1]);
		int a2[] = new int[a];
		for(int i=0;i<a;i++) {
			a2[i]=Integer.parseInt(s[2+i]);
		}
		Lock ob = new Lock(s[0],a,a2,s[s.length-1]);
		//System.out.println("Enter");
		return ob;
	}
}
