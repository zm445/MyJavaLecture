package com.aa.gym;

import java.util.ArrayList;
import java.util.Scanner;

import com.aa.gym.data.Member;
import com.aa.gym.display.Title;

public class Gym {

	void proc() {
		
		ArrayList<Member> members = new ArrayList<Member>();
		
		members.add(new Member(1,"이순신","010-1234-5678","남자"));
		members.add(new Member(1,"김민겸","010-1234-5678","남자"));
		members.add(new Member(1,"김정훈","010-1234-5678","남자"));
		
		System.out.println(Title.TITLE);
		
		Scanner sc = new Scanner(System.in);
		boolean isNotEnd = true;
		while(isNotEnd) {
			System.out.println("명령을 입력: (1.회원 추가 / 2.회원목록 보기 / 3.회원삭제 / 4.회원수정 / e.프로그램 종료)");
			String cmd = sc.next();
			switch (cmd) {
			case "1":	
				break;
			case "2":	
				
				break;
			case "3":	
				
				break;
			case "4":	
				
				break;
			case "e":	
				
				break;
			default:
				System.out.println("잘못된 명령입니다.");
				
				break;
			}
			
			
			
		}
		
		
		
		
		
	}
	
}
