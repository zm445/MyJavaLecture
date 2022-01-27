package com.aa.gym.data;

public class Member {
	
	private Integer num;
	private String name;
	private String tel;
	private String sex;
	
	
	public Member(Integer num, String name, String tel, String sex) {
		this.num = num;
		this.name = name;
		this.tel = tel;
		this.sex = sex;
	}


	public Integer getNum() {
		return num;
	}


	public void setNum(Integer num) {
		this.num = num;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public String getTel() {
		return tel;
	}


	public void setTel(String tel) {
		this.tel = tel;
	}


	public String getSex() {
		return sex;
	}


	public void setSex(String sex) {
		this.sex = sex;
	}
	
	public void info() {
		System.out.println("회원번호:"+num+" 이름:"+name+" 전번:"+tel+" 성별:"+sex);
	}
	
	
	
}
