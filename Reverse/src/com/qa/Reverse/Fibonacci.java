package com.qa.Reverse;

public class Fibonacci {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int a=0,b=1,c;
System.out.print(a+""+b);

for(int i=3;i<=10;i++)
    {
	c=a+b;
    
  System.out.println(""+c);
  a=b;
  b=c;
  }
	}

}
