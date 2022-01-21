package com.aa.gym.control;

import java.util.Scanner;

import com.aa.gym.data.Member;

public class SignUp {
	
	Scanner scan = new Scanner(System.in);
	
	public Member up() {
		System.out.print("[가입] 이름 입력: ");
		String n = scan.next();
		System.out.print("[가입] 전화번호 입력: ");
		String t = scan.next();
		System.out.print("[가입] 성별 입력: ");
		String s = scan.next();
		
		return new Member(n,t,s);
	}
	
}
