package problems;

public class StringToNEqualParts {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       String str="aaaabbbbcccc";
       int len=str.length();
       int n=3,temp=0;
       int chars=len/n;
       String[] equalstr=new String[n];
       if(len%n!=0) {
    	   System.out.println("string cannot be divided in to n equal parts");
       }
       else {
    	   for(int i=0;i<len;i=i+chars) {
    		   String part= str.substring(i, i+chars);
    		
    		   equalstr[temp]=part;
    		   temp=temp+1;
    		  
    	   }
    	   System.out.println(n);
    	   for(int i=0;i<equalstr.length;i++) {
    		   System.out.println(equalstr[i]);
    	   }
       }
	}

}
