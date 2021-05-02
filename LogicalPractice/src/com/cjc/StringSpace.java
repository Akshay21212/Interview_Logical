package com.cjc;

public class StringSpace {
//Convert String Into Char array and Use For loop
public static void main(String[] args) {
	String str="Java is a programming language";
	//method1 
	char[] chars =str.toCharArray();
	System.out.println(chars);
    System.out.println(chars.length);
	String str1="";
	for(int i=0; i<chars.length ;i++) {
	if(chars[i]!=' ') {
		str1=str1+chars[i];
	}
	
	}
	System.out.println(str1);
}
}
