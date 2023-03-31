package problems;

import java.util.Scanner;

public class duplicate {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
        String str1=sc.next();
        int count;
        char[] arr=str1.toCharArray();
        for(int i=0;i<str1.length();i++) {
        	count=1;
        	for(int j=i+1;j<str1.length();j++) {
        		if(arr[i]==arr[j]&& arr[i]!=' ') {
        			count=count+1;
        			arr[j]=0;
        		}
        	}if(count>1&&arr[i]!='0') {
        		System.out.print(arr[i]);
        	
        	}
        }
	}

}
