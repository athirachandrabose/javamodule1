package oopsday4.composition;

public class CompanyHR {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Address resads= new Address("31","mannath","worli","mumbai",40048);
Address comads=new Address("32","antilla","bandra","mumbai",40038);
Employee emp1=new Employee("john","male",24,101,"b3452",50000,resads,comads);
System.out.println(emp1);
Employee emp2= new Employee("john", "male", 24, 102, "b3452", 50000,resads,comads);
System.out.println(emp2);
Employee emp3=new Employee("john", "male", 24, 103, "b3452", 50000,resads,comads);
System.out.println(emp3);
Employee emp4 =new  Employee("john","male", 24, 104, "b34523", 50000,resads,comads);
System.out.println(emp4);
Employee emp5= new Employee("john", "male", 24,101, "b3452", 50000,resads,comads);
System.out.println(emp5);
	
	if(emp1.equals(emp5)) {
		System.out.println("objects are same");
	}
	else
		System.out.println("not same");
}		
}
