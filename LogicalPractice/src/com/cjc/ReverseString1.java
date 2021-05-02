package com.cjc;

public class ReverseString1 {
public static void main(String[] args) {
	//usingChar();
	//usingReplaceall();
	usingReplaceAll();
}

public static void usingChar() {
	String str="Java is a Programming Language";
	 char[] chars=str.toCharArray();
	 System.out.println(chars);
	 int len=chars.length;
	 System.out.println(len);
	 String str1="";
	 for(int i=0; i<len;i++) {
		 if(chars[i]!=' ') {
			str1=str1+chars[i];
		 }
	
	 System.out.println(str1);
	 }	
}

public static void usingreplace() {
	String str="Java is a Programming Language";
	System.out.println(str.replace(" ", ""));
}

public static void usingReplaceAll() {
	String str="!@# Hello 123 !@# Java 980 $%^& World $%^&! ";
	
//	System.out.println(str.replaceAll("[^a-zA-Z0-9]", ""));

	System.out.println(str.replaceAll("[^0-9]", ""));
}


}
