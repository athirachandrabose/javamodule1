package Serialization.test;

import java.io.ObjectInputStream;
import java.io.FileInputStream;
import java.io.IOException;

public class TestEmployee2 {

	public static void main(String[] args) throws IOException, ClassNotFoundException {
		// TODO Auto-generated method stub
		String str="helloworld";
		FileInputStream fis = new FileInputStream("D:\\ustcore\\IOSerialization\\emp.dat");
		ObjectInputStream Ois = new ObjectInputStream(fis);
		Object obj = Ois.readObject();
		Employee ref = (Employee) obj;
		System.out.println(ref); 
		int a=10;
	}

}
