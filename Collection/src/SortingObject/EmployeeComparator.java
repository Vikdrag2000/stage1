package SortingObject;

import java.util.Comparator;

public class EmployeeComparator implements Comparator<Employee> {

	@Override
	public int compare(Employee o1, Employee o2) {
		String a = o1.name;
		String b = o2.name;
		return a.compareTo(b);
	}

}
