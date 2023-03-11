package userdefinedobject;
import java.util.*;

//import oopsday4.inheritance.Employee;
public class TestEmpArrayList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     ArrayList<Employee> emplist=new ArrayList();
		// TODO Auto-generated method stub
Employee emp1=new Employee("john","male",24,101,"b3452",50000);
Employee emp2= new Employee("john", "male", 24, 102, "b3452", 50000);
Employee emp3=new Employee("john", "male", 24, 103, "b3452", 50000);
Employee emp4 =new  Employee("john","male", 24, 104, "b34523", 50000);
Employee emp5= new Employee("john", "male", 24,101, "b3452", 50000);
 
emplist.add(emp1);
emplist.add(emp2);
emplist.add(emp3);
emplist.add(emp4);
emplist.add(emp5);

System.out.println(emplist);
	}

}
