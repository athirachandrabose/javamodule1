package methodrefs;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.function.Consumer;

interface Formula{
	public void m1();
}
class some{
	public static void m2() {
		System.out.println("from m2-----");
	}
}
class other{
	other(){
		System.out.println("from other constructor---");
	}
	void m2(String str) {
		System.out.println("from m2.....");
	}
}
public class TestMethodRefs {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
          Formula f=some::m2;//method reference operator
          f.m1();//from m2-----
       f=other::new;//constructor reference
       other o= new other();//from other constructor---
          
       List<String> list=Arrays.asList("one","two","three");
       list.stream().forEach(System.out::println);//instance method reference
	   List<Integer> intlist=Arrays.asList(1,23,145,67,89);
	  Optional<Integer> num= intlist.stream().reduce(Math::min);//static method reference
	  System.out.println(num.get());//1
	  Optional<Integer> nums= intlist.stream().reduce(Math::max);
	  System.out.println(nums.get());//145
	}

}
