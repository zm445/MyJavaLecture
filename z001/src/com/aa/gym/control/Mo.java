package com.aa.gym.control;

import java.util.ArrayList;
import java.util.Scanner;

import com.aa.gym.data.Member;

public class Mo {
	
	Scanner scan = new Scanner(System.in);
	
	public void mo(ArrayList<Member> members) {
		
		boolean run = true;
		while(run) {
			
			System.out.print("수정할 회원이름 입력: ");
			String name = scan.next();
			
			int check = -1;
			
			for(int i=0; i<members.size(); i++) {
				if(members.get(i).name.equals(name)) {
					check = 1;
					System.out.print("[수정] 이름 입력: ");
					members.get(i).name = scan.next();
					
					System.out.print("[수정] 전화번호 입력: ");
					members.get(i).tel = scan.next();
					
					System.out.print("[수정] 성별 입력: ");
					members.get(i).sex = scan.next();
				}
			}
			
			if(check == 1) {
				System.out.println("수정되었습니다");
				run = false;
			} else {
				System.out.println("잘못 입력하셨습니다.");
			}
			
		}
		
	}
	
}
