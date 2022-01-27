package com.aa.gym;

import java.util.ArrayList;
import java.util.Scanner;

import com.aa.gym.data.Member;
import com.aa.gym.display.Title;
import com.aa.gym.proc.MenuExit;
import com.aa.gym.proc.MenuMemberDel;
import com.aa.gym.proc.MenuMemberEdit;
import com.aa.gym.proc.MenuMemberList;
import com.aa.gym.proc.MenuMemberReg;

public class Gym {

	void proc() {
		
		ArrayList<Member> members = new ArrayList<Member>();
		System.out.println(Title.TITLE);
		
		members.add(new Member(1,"김태민","010-1234-5678","남자"));
		members.add(new Member(2,"김정훈","010-1234-5678","남자"));
		members.add(new Member(3,"김병훈","010-1234-5678","남자"));
		
		Select:
		while(true) {
			Scanner scan = new Scanner(System.in);
			
			System.out.print("[1]회원추가 [2]회원목록보기 [3]회원삭제 [4]회원수정 [e]종료 :");
			String choice = scan.next();
			
			switch (choice) {
			case "1":
				MenuMemberReg menuMemberReg = new MenuMemberReg();
				menuMemberReg.proc(members);
				break;
			case "2":
				MenuMemberList menuMemberList = new MenuMemberList();
				menuMemberList.proc(members);
				break;
			case "3":
				MenuMemberDel menuMemberDel = new MenuMemberDel();
				menuMemberDel.proc(members);
				break;
			case "4":
				MenuMemberEdit menuMemberEdit = new MenuMemberEdit();
				menuMemberEdit.proc(members);
				break;
			case "e":
				MenuExit menuExit = new MenuExit();
				menuExit.proc();				
				break Select; 
			default:
				System.out.println("잘못 입력하셨습니다.");
				break;
			}
			
		}
	}
	
	
	
}
