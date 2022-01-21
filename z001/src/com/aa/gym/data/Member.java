package com.aa.gym.data;

public class Member {
	
	public String name;
	public String tel;
	public String sex;
	
	
	public Member(String name, String tel, String sex) {
		this.name = name;
		this.tel = tel;
		this.sex = sex;
	}
	
	public void info() {
		System.out.println("이름: " + name + " 전화번호: " + tel + " 성별: " + sex);
	}
	
	
	
}
