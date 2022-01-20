package com.aa.gym.control;

import java.util.ArrayList;
import java.util.Scanner;

public class Dm {
	
	Scanner sc = new Scanner(System.in);
	
	
	public int D(ArrayList<Member> members) {
		
		System.out.print("삭제할 회원의 이름을 입력하세요: ");
		String n = sc.next();
		
		int idx = 0;
		for(int i=0; i<members.size(); i++) {
			if(n.equals(members.get(i).name)) {	
				idx = i;
			}
		}
		
		return idx;
	}
	
	
}
