package userdefinedobject;

import java.util.*;

public class TestHashMap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Employee emp1 = new Employee("john", "male", 24, 101, "b3452", 50000);
		Employee emp2 = new Employee("john", "male", 24, 102, "b3452", 50000);
		Employee emp3 = new Employee("john", "male", 24, 103, "b3452", 50000);
		Employee emp4 = new Employee("john", "male", 24, 104, "b34523", 50000);
		Employee emp5 = new Employee("john", "male", 24, 101, "b3452", 50000);
		
	    HashSet<Employee> empset = new HashSet();
		empset.add(emp1);
		empset.add(emp2);
		empset.add(emp3);
		empset.add(emp4);
		empset.add(emp5);
		
		ArrayList<Employee> emplist = new ArrayList();
		emplist.add(emp1);
		emplist.add(emp2);
		emplist.add(emp3);
		emplist.add(emp4);
		emplist.add(emp5);
		
		TreeSet<Employee> empTreeset = new TreeSet();
		empTreeset.add(emp1);
		empTreeset.add(emp2);
		empTreeset.add(emp3);
		empTreeset.add(emp4);
		empTreeset.add(emp5);
		
		HashMap<String, Collection> datamap = new HashMap();
		datamap.put("emplist", emplist);
		datamap.put("empset", empset);
		datamap.put("empTreeset", empTreeset);
		System.out.println(datamap);
		System.out.println(datamap.size());
		
		
		Collection<Employee> list=datamap.get("emplist");
		Iterator<Employee> iter=list.iterator();
		while(iter.hasNext()) {
			System.out.println(iter.next());
		}
		Collection<Employee> set=datamap.get("empset");
		iter=set.iterator();
		while(iter.hasNext()) {
			System.out.println(iter.next());
		}
		Collection<Employee> Treeset=datamap.get(empTreeset);
		iter=Treeset.iterator();
		while(iter.hasNext()) {
			System.out.println(iter.next());
		}
	}

}
