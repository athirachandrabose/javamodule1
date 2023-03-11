package Listdemo;
import java.util.ArrayList;
import java.util.Iterator;
public class TestArrayList2 {
	public static void main(String[] args) {
		
	
ArrayList<String> colors=new ArrayList<String>();
colors.add("green");
colors.add("blue");
colors.add("white");
colors.add("brown");
colors.add("yellow");
colors.add("orange");
colors.add(null);
colors.add(null);
System.out.println(colors);
System.out.println(colors.size());
}
}