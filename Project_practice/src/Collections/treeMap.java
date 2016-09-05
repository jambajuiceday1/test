package Collections;

import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.TreeMap;

public class treeMap {

	public static void main(String[] args) {
		Employee e1 = new Employee("abc", 10);
		Employee e2 = new Employee("hij", 0);
		Employee e3 = new Employee("xyz", 8);

		TreeMap<Integer, Employee> treeMap = new TreeMap<Integer, Employee>();

		treeMap.put(e1.age, e1);
		treeMap.put(e2.age, e2);
		treeMap.put(e3.age, e3);

		Set set = treeMap.entrySet();

		Iterator i = set.iterator();

		while (i.hasNext()) {
			Map.Entry me = (Entry) i.next();
			
			System.out.println("name "+me.getKey()+" value "+me.getValue());
		}
	}

}
