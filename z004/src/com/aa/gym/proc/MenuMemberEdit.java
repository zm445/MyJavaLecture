package com.aa.gym.proc;


import java.util.ArrayList;
import java.util.Scanner;

import com.aa.gym.data.Member;

public class MenuMemberEdit {
	
	public void proc(ArrayList<Member> members) {
		Scanner scan = new Scanner(System.in);
		
		System.out.print("수정하실 회원의 번호를 입력해주세요 (x:취소) :");
		String editNum = scan.next();
		
		if(editNum.equals("x")) {
			System.out.println("취소되었습니다.");
			return;
		}
		
		int editIdx = -1;
		
		for(int i=0; i<members.size(); i++) {
			try {
				if(members.get(i).getNum() == Integer.parseInt(editNum)) {
					editIdx = i;
					break;
				}				
			} catch(NumberFormatException e) {
				System.out.println("잘못 입력하셨습니다.");
				return;
			}
		}
		
		if(editIdx != -1) {
			
			Member m = members.get(editIdx);
			
			Select:
			while(true) {
				System.out.print("무엇을 수정하시겠습니까? (1)이름 (2)전화번호 (3)성별 (4)모두 (x:취소) :");
				String edit = scan.next();
				
				String n;
				String t;
				String s;
				
				switch (edit) {
				case "1":
					System.out.println("수정하실 이름을 입력해주세요 (x:취소)");
					n = scan.next();
					
					if(n.equals("x")) {
						System.out.println("취소되었습니다.");
						return;
					}					
					
					m.setName(n);
					System.out.println("수정되었습니다.");	
					
					break Select;
				case "2":
					System.out.println("수정하실 전화번호를 입력해주세요 (x:취소)");
					t = scan.next();
					
					if(t.equals("x")) {
						System.out.println("취소되었습니다.");
						return;
					}					
					
					m.setTel(t);
					System.out.println("수정되었습니다.");
					
					break Select;
				case "3":
					System.out.println("수정하실 성별을 입력해주세요 (x:취소)");
					s = scan.next();
					
					if(s.equals("x")) {
						System.out.println("취소되었습니다.");
						return;
					}					
					
					m.setSex(s);
					System.out.println("수정되었습니다.");
					
					break Select;
				case "4":
					System.out.println("수정하실 이름을 입력해주세요 (x:취소)");
					n = scan.next();
					
					if(n.equals("x")) {
						System.out.println("취소되었습니다.");
						return;
					}					
					
					System.out.println("수정하실 전화번호를 입력해주세요 (x:취소)");
					t = scan.next();
					
					if(t.equals("x")) {
						System.out.println("취소되었습니다.");
						return;
					}
					
					System.out.println("수정하실 성별을 입력해주세요 (x:취소)");
					s = scan.next();
					
					if(s.equals("x")) {
						System.out.println("취소되었습니다.");
						return;
					}
					
					m.setName(n);
					m.setTel(t);
					m.setSex(s);
					System.out.println("수정되었습니다.");
					
					break Select;
				case "x":
					System.out.println("취소되었습니다.");
					break Select;
				default:
					System.out.println("잘못 입력하셨습니다.");
					break;
				}
			}
			
		} else {
			System.out.println("없는 회원번호입니다.");
		}
		
	}
	
	
	
}
