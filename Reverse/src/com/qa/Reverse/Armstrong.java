package com.qa.Reverse;

public class Armstrong {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i=153,sum=0,a,b,n;   //a=rem; 
		 n=i;
		while(i>0)
		{
			a=i%10;
			b=a*a*a;
			sum=sum+b;
			i=i/10;
	  }
if (sum==n)
{
	System.out.println("n is Armstrong number");
}
else {
	System.out.println("n is not Armstrong number");
}
	}

}
