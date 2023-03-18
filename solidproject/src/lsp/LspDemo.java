package lsp;

public class LspDemo {
      public void CalculateArea(ShapeIface s) {
    	  System.out.println(s.getArea());
      }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
       LspDemo lsp=new LspDemo();
       lsp.CalculateArea(new Rectangle(4,6));
       lsp.CalculateArea(new square(4));
	}

}
