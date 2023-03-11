package oopsday3shape;
import java.util.Scanner;

public class pointoper {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	Scanner sc=new Scanner(System.in);	    
	System.out.println("enter initial x coordinate");
	int x1= sc.nextInt();
	
	System.out.println("enter y coordinate");
	int y1= sc.nextInt();
	System.out.println("enter final x coordinate");
	int x2=sc.nextInt();
	Point p1= new Point(x1,y1);
	Point p2=new Point(x2,y1);
	drawLine d=new drawLine();
	d.draw(p1,p2);
	}

}
