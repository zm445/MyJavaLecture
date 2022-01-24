package com.aa.gym;

public class Main {

	public static void main(String[] args) {
	
		A a = new A();
		B b = new B();
		
		a.setB(b);
		a.getB().run();
		
		
		
	}
}
