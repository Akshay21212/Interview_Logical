package com.cjc;

public class StringSwap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String a="Hello";
		String b="World";
		System.out.println("Before Swapping : "); 
		System.out.println("The value of a : "+a);
		System.out.println("The value of b : "+b);
		//append a and b
		a=a+b;
		System.out.println(a);
//Store initial string a in String b
 b=a.substring(0, a.length()-b.length());
 System.out.println(a.length()-b.length());
//Store initial b in String a
 a=a.substring(b.length());
System.out.println("After Swap : ");
System.out.println("The value of a : "+a);
System.out.println("The value of b : "+b);
//b=a.su
	}
 
}
