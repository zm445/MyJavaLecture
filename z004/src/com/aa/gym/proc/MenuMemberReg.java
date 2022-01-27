package com.aa.gym.proc;

import java.util.ArrayList;
import java.util.Scanner;

import com.aa.gym.data.Member;

public class MenuMemberReg {
	
	public void proc(ArrayList<Member> members) {
		Scanner scan = new Scanner(System.in);
		String name;
		String tel;
		String sex;
		
		System.out.println("추가할 회원의 이름을 입력하세요 (x:취소)");
		name = scan.next();
		if(name.equals("x")) {
			System.out.println("취소되었습니다.");
			return;
		}
		System.out.println("추가할 회원의 전화번호를 입력하세요 (x:취소)");
		tel = scan.next();
		if(tel.equals("x")) {
			System.out.println("취소되었습니다.");
			return;
		}
		System.out.println("추가할 회원의 성별을 입력하세요 (x:취소)");
		sex = scan.next();
		if(sex.equals("x")) {
			System.out.println("취소되었습니다.");
			return;
		}
		int newNum = getLastNum(members);
		newNum++;
		
		members.add(new Member(newNum,name,tel,sex));
		System.out.println("회원이 추가되었습니다.");
	}
	
	private int getLastNum(ArrayList<Member> members) {
		int idx = 0;
		for(int i=0; i<members.size(); i++) {
			idx = members.get(i).getNum();
		}
		return idx;
	}
	
	
	
}
