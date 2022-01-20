package com.aa.gym.control;

import java.util.ArrayList;
import java.util.Scanner;

public class Ci {
	
	Scanner sc = new Scanner(System.in);
	
	public void modify(ArrayList<Member> members) {
		
		System.out.print("수정하실 회원의 이름을 입력하세요: ");
		String n = sc.next();
		
		
		for(int i=0; i<members.size(); i++) {
			if(n.equals(members.get(i).name)) {
				System.out.print("수정하실 회원의 이름 전화번호 성별을 입력하세요 ex)해라 010-46 여자");
				members.get(i).name = sc.next();
				members.get(i).tel = sc.next();
				members.get(i).sex = sc.next();
			}
		}
		
		
	}
	
	
	
}
