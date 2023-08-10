package com.java.oops.collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class CustomSorting {

	public static void main(String[] args) {

		ArrayList<Employee> employees = new ArrayList<Employee>();
		employees.add(new Employee(4, "Mohan", 20));
		employees.add(new Employee(4, "Aries", 29));
		employees.add(new Employee(8, "Lila", 23));
		employees.add(new Employee(2, "Tame", 40));
		employees.add(new Employee(7, "Tomm", 54));
		
		Collections.sort(employees,new EmployeeIDComparator());

		Collections.sort(employees,(e1,e2)->{
			if (e1.empID == e2.empID)
				return 0;
			else if (e1.empID > e2.empID)
				return 1;// positive no
			else
				return -1;// negative no
		});
		
		employees.stream().forEach(System.out::println);

	}

}

class EmployeeIDComparator implements Comparator<Employee>{

	@Override
	public int compare(Employee e1, Employee e2) {
		if (e1.empID == e2.empID)
			return 0;
		else if (e1.empID > e2.empID)
			return 1;// positive no
		else
			return -1;// negative no
	}
	
}
