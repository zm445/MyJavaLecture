package com.Riot.lol.control;

import java.util.Scanner;

public class Game {
	
	static Scanner scan = new Scanner(System.in);
	
	public static String start() {
		System.out.print("문자열을 입력하세요 : ");
		String cmd = scan.next();
		return cmd;
	}
	
	
}
