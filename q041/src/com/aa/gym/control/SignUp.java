package com.aa.gym.control;

import java.util.Scanner;

public class SignUp {
	
	Scanner sc = new Scanner(System.in);
	
	public Member up() {
		
		System.out.print("이름 전화번호 성별을 순서대로 입력하세요 ex)이순신 010-09 여자");	
		
		return new Member(sc.next(),sc.next(),sc.next());
	}
	
	
}
