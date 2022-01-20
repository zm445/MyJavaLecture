package com.aa.gym.control;

public class Member {
	
	String name;
	String tel;
	String sex;
	
	
	public Member(String n, String t, String s) {
		this.name = n;
		this.tel = t;
		this.sex = s;
	}
	
	public void info() {
		System.out.println(name);
		System.out.println(tel);
		System.out.println(sex);
	}
	
	
	
}
