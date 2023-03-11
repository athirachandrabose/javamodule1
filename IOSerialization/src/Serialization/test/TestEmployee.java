package Serialization.test;

import java.io.ObjectOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class TestEmployee {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		Employee emp = new Employee(101, "john doe", 40000,"chumma");
		FileOutputStream FOS = new FileOutputStream("emp.dat");
		ObjectOutputStream OOA = new ObjectOutputStream(FOS);
		OOA.writeObject(emp);
	}

}
