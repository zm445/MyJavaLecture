package com.aa.gym.proc;

import java.util.ArrayList;
import java.util.Scanner;

import com.aa.gym.data.Member;

public class MenuMemberDel {
	
	public void proc(ArrayList<Member> members) {
		Scanner scan = new Scanner(System.in);
		String delNum;
		
		System.out.print("삭제할 회원번호를 입력해주세요 (x:취소) :");
		delNum = scan.next();
		
		if(delNum.equals("x")) {
			System.out.println("취소되었습니다.");
			return;
		}
		
		int delIdx = -1;
		
		for(int i=0; i<members.size(); i++) {
			try {
				if(members.get(i).getNum() == Integer.parseInt(delNum)) {
					delIdx = i;
					break;
				}				
			} catch(NumberFormatException e){
				System.out.println("잘못 입력하셨습니다.");
				return;
			}
		}
		
		if(delIdx != -1) {
			members.remove(delIdx);
			System.out.println("[회원번호:" + delNum + "]회원이 삭제되었습니다.");
		} else {
			System.out.println("없는 회원번호입니다.");
		}
		
	}
	
	
}
