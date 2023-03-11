package oopsday3shape;

public class drawLine implements PointIface {

	@Override
	public void draw(Point p1, Point p2) {
		// TODO Auto-generated method stub
           int i=0;
           for(i=p1.getX();i<p2.getX();i++)
        	   System.out.print(".");
	}

}
