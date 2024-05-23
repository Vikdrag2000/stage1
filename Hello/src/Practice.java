public class Practice {

	public static void main(String[] args) {
	    
	    int n=150;
	    
	   for(int i=1;i<=n;i++){
	       if(i>99){
	           break;
	       }
	       if(i%10==0){
	           continue;
	       }
	       System.out.println(i);
	   }
	   int i =1;
	   while(i<=n) {
		   if(i>99){
	           break;
	       }
	       if(i%10==0){
	    	   i++;
	           continue;
	       }
	       System.out.println(i);
	       i++;
	   }
	}

}

