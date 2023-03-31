package problems;

public class subsetofstring {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        String str="fun";
        int len=str.length();
        int temp=0;
        String[] array=new String[len*(len+1)/2];
        for(int i=0;i<len;i++) {
        	for( int j=i;j<len;j++) {
        		array[temp]=str.substring(i, j+1);
        		temp=temp+1;
        	}
        	
        }
        System.out.println("all subset of strings:");
        for(int i=0;i<array.length;i++)
        	System.out.println(array[i]);
	}

}
