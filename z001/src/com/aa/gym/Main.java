package com.aa.gym;

import java.util.ArrayList;
import java.util.Scanner;

import com.aa.gym.control.Del;
import com.aa.gym.control.Mo;
import com.aa.gym.control.SignUp;
import com.aa.gym.data.Member;
import com.aa.gym.display.Title;

public class Main {
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println(Title.TITLE);
		
		ArrayList<Member> members = new ArrayList<Member>();
		
		members.add(new Member("뎅기스","010-12","여자"));
		members.add(new Member("베인","010-23","남자"));
		members.add(new Member("프라페","010-34","여자"));
		members.add(new Member("파올루스","010-45","남자"));
		members.add(new Member("디욜싸인","010-56","여자"));
		
		boolean run = true;
		while(run) {
			
			System.out.print("[1]회원정보 [2]회원가입 [3]회원삭제 [4]회원수정 [e]종료: ");
			String choice = scan.next();
			
			switch (choice) {
			case "1":
				for(Member m : members) {
					m.info();
				}
				break;
			case "2":		
				members.add(new SignUp().up());
				System.out.println("가입되었습니다.");
				break;
			case "3":
				members.remove(new Del().D(members));
				System.out.println("삭제되었습니다.");
				break;
			case "4":
				new Mo().mo(members);
				break;
			case "e":
				System.out.println("프로그램 종료");
				run = false;
				break;
			default:
				System.out.println("잘못 입력하였습니다.");
				break;
			}
		}
		
		
		scan.close();
		
		
	}
}
