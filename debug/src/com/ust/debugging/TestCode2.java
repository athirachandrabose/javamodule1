package com.ust.debugging;

public class TestCode2 {
int a;
int b;
int x;
int res;
 int a1[]= {2,5,7,8,5};
 int b1[]= {23,43,27,33,12};
 int x1[]= {18,10,20,21,32};
 //ax^2+bx^2+2ab
  void equation() {
	  for(int i=0;i<a1.length;i++) {
		  a=a1[i];
		  b=b1[i];
		  x=x1[i];
		  res=(a*(x*x)+b*(x*x)+2*a*b);
		  System.out.println(res);
	  }
  }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
       new TestCode2().equation();
	}

}
