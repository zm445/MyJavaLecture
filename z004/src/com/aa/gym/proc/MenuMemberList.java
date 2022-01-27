package com.aa.gym.proc;

import java.util.ArrayList;

import com.aa.gym.data.Member;

public class MenuMemberList {
	
	public void proc(ArrayList<Member> members) {
		
		for(Member m : members) {
			m.info();
		}
		
	}
	
	
}
