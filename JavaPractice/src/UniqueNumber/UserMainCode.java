package UniqueNumber;

public class UserMainCode {

	public static int getUnique(int num) {
		String s[] = Integer.toString(num).split("");
		
		if(num>0 && Integer.parseInt(s[0])!=0) {
			for(String j: s) {
				int a=0;
				for(int i=0;i<s.length;i++) {
					
					if(Integer.parseInt(s[i])==Integer.parseInt(j)){
						a+=1;
						if(a==2) {
							return -1;
						}
					}
				}
			}
		}
		
		return 1;
	}
}
