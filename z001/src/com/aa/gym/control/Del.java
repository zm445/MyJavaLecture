package com.aa.gym.control;

import java.util.ArrayList;
import java.util.Scanner;

import com.aa.gym.data.Member;

public class Del {
	
	Scanner scan = new Scanner(System.in);
	
	public int D(ArrayList<Member> members) {
		
		System.out.print("삭제할 회원 이름 입력: ");
		String n = scan.next();
		
		int idx = 0;
		for(int i=0; i<members.size(); i++) {
			if(members.get(i).name.equals(n)) {
				idx = i;
			}
		}
		
		return idx;
	}
	
	
}
