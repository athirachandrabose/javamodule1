package userdefinedobject;
import java.util.*;

//import oopsday4.inheritance.Employee;
public class TestEmpHashSet {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     HashSet<Employee> empset=new HashSet();
		// TODO Auto-generated method stub
Employee emp1=new Employee("john","male",24,101,"b3452",50000);
Employee emp2= new Employee("john", "male", 24, 102, "b3452", 50000);
Employee emp3=new Employee("john", "male", 24, 103, "b3452", 50000);
Employee emp4 =new  Employee("john","male", 24, 104, "b34523", 50000);
Employee emp5= new Employee("john", "male", 24,101, "b3452", 50000);
 
empset.add(emp1);
empset.add(emp2);
empset.add(emp3);
empset.add(emp4);
empset.add(emp5);

System.out.println(empset);
	}

}
