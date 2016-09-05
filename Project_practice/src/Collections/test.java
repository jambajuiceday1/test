package Collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class test {

	public static void main(String[] args) {

		Employee e1 = new Employee("abc", 10);
		Employee e2 = new Employee("hij", 10);
		Employee e3 = new Employee("xyz", 10);

		List<Employee> list = new ArrayList<Employee>();
		list.add(e2);
		list.add(e3);
		list.add(e1);

		for (Employee l : list) {

			System.out.println(l.name);
		}

		System.out.println("\n\n");
		//Collections.sort(list);

		for (Employee l : list) {

			System.out.println(l.name);
		}

	}

}
