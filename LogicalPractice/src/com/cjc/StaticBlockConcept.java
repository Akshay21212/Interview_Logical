package com.cjc;

public class StaticBlockConcept {
	public StaticBlockConcept(){
		System.out.println("Constructor");
	}
	static {
		System.out.println("Static");
	}
	
	{
		System.out.println("NonStaic");
	}
	public static void main(String[] args) {
		System.out.println("main");
		StaticBlockConcept s=new StaticBlockConcept();
		
	}

}
