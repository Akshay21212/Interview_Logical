package com.cjc;

public class MisssingArrayNum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int a[]= {1,2,3,4,5,7,8,9,10};
int sum=0;
System.out.println(a.length);
for(int i=0; i<a.length; i++) {
	sum=sum+a[i];
}
System.out.println(sum);
	
	int sum1=0;
for(int j=1;j<=10;j++) {
	sum1=sum1+j;
}
System.out.println(sum1);
System.out.println("Missing Number Is ::"+(sum1-sum));


	}
}