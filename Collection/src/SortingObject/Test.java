package SortingObject;

import java.util.Set;
import java.util.TreeSet;

public class Test {

	public static void main(String[] args) {

		Set<Employee> set = new TreeSet<>(new EmployeeComparator());
		
		set.add(new Employee(34,"Vikash"));
		set.add(new Employee(35,"Ujjwal"));
		set.add(new Employee(35,"Biswa"));
		set.add(new Employee(33,"Gaurav"));
		
		for(Employee i: set) {
			System.out.println(i.id);
			System.out.println(i.name);
		}
	}

}
