package Collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Run {

	public static void main(String[] args) {

		Employee e1 = new Employee("abc", 10);
		Employee e2 = new Employee("hij", 0);
		Employee e3 = new Employee("xyz", 8);

		List<Employee> list = new ArrayList<Employee>();
		list.add(e1);
		list.add(e2);
		list.add(e3);

		Collections.sort(list, new sortById());

		System.out.println("\n\n");
		for (Employee s : list) {
			System.out.println("name "+s.name +"  age " +s.age);
		}
		
		Collections.sort(list,new sortByname());
		System.out.println("\n\n");
		for (Employee s : list) {
			System.out.println("name "+s.name +" age " +s.age);
		}

	}

}
