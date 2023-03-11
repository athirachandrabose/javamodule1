package userdefinedobject;
import java.util.*;

//import oopsday4.inheritance.Employee;
public class TestEmpTreeSet {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     TreeSet<Employee> empTreeset=new TreeSet();
		// TODO Auto-generated method stub
Employee emp1=new Employee("john","male",24,101,"b3452",50000);
Employee emp2= new Employee("john", "male", 24, 102, "b3452", 50000);
Employee emp3=new Employee("john", "male", 24, 103, "b3452", 50000);
Employee emp4 =new  Employee("john","male", 24, 104, "b34523", 50000);
Employee emp5= new Employee("john", "male", 24,101, "b3452", 50000);
 
empTreeset.add(emp1);
empTreeset.add(emp2);
empTreeset.add(emp3);
empTreeset.add(emp4);
empTreeset.add(emp5);

System.out.println(empTreeset);
	}

}
