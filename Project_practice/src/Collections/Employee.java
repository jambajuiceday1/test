package Collections;

import java.util.Comparator;

public class Employee implements Comparable<Employee> {

	String name;
	int age;

	public Employee(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	@Override
	public int compareTo(Employee arg0) {

		return 0;
	}

}
