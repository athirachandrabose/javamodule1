package javarecord;

public class TestRecord {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      Person john= new Person("john",30);
      Person sarah= new Person("sarah",25);
      
      System.out.println(john.name());
      System.out.println(sarah.age());
	}

}
