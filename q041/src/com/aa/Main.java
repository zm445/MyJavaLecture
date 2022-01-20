package com.aa;

import java.util.ArrayList;
import java.util.Scanner;

import com.aa.gym.control.Ci;
import com.aa.gym.control.Dm;
import com.aa.gym.control.Member;
import com.aa.gym.control.SignUp;
import com.aa.gym.display.Title;

// 헬스장 회원 만들기 

public class Main {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		ArrayList<Member> members = new ArrayList<Member>();
			
		System.out.println(Title.TITLE);
		
		members.add(new Member("준혁", "010-12", "남자"));
		members.add(new Member("지원", "010-23", "여자"));
		members.add(new Member("유라", "010-34", "여자"));
		members.add(new Member("재형", "010-45", "여자"));
		members.add(new Member("예환", "010-56", "여자"));
		
		boolean run = true;
		
		while(run) {
			
			System.out.print("[1]회원정보 출력 [2]회원가입 [3]회원삭제 [4]회원수정 [e]종료: ");
			String choice = sc.next();
			
			switch (choice) {
			case "1":
				for(Member print : members) {
					print.info();
				}
				break;
			case "2":				
				members.add(new SignUp().up());			
				break;
			case "3":
				members.remove(new Dm().D(members));
				System.out.println("삭제되었습니다.");
				break;
			case "4":
				Ci c = new Ci();
				c.modify(members);
				System.out.println("수정되었습니다.");
				break;
			case "e":
				System.out.println("종료");
				run = false;
				break;
			default:
				System.out.println("잘못 입력하셨습니다.");
				break;
			}
		}
		
		sc.close();
		
		
		
		
		
	}
}
