package Collections;

import java.util.Comparator;

public class sortById implements Comparator<Employee> {

	@Override
	public int compare(Employee o1, Employee o2) {
		// TODO Auto-generated method stub
		return (o1.age > o2.age)  ? 1: (o1.age < o2.age) ? -1 : 0;
	}

}
