package SortingObject;

public class Employee implements Comparable<Employee>{
     int id;
     String name;
     public Employee(int a,String s) {
    	 this.id=a;
    	 this.name=s;
     }
	@Override
	public int compareTo(Employee o) {
		int a1 = this.id;
		int b1 = o.id;
		if(a1>b1){
			return 1;
			
		}
		else if(a1<b1){
			return -1;
			
		}
		else {
			return 0;
		}
		
	}

     
}
