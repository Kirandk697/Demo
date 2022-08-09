package com.qa.practice2;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demo2 {
	int maxElements;
	void Demo2()
	{
		maxElements=100;
		System.out.println(maxElements);
	}
	Demo2(int i)

	{
	maxElements=i;
	System.out.println(maxElements);
	}
public Demo2() {
		// TODO Auto-generated constructor stub
	}
public static void main(String[] args) {
		// TODO Auto-generated method stub
Demo2 a=new Demo2();
Demo2 b=new Demo2(999);
}
	
}
