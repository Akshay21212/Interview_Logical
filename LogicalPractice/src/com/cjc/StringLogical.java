package com.cjc;

public class StringLogical {

	public static void main(String[] args) {
 String str="Akshay.Tidke";
 String str1="";
 char[] chars=str.toCharArray();
 for(int i=0; i<chars.length; i++) {
	 if(chars[i]!='.') {
		 str1=str1+chars[i];
	 }
 }
System.out.println(str1);
	}

}
