package com.peisia.lol.data.user;

import com.peisia.lol.util.So;

public class User {
	static public String characterName = "";
	public static String characterSex;
	public static String characterJob;
	public static int currentHp = 200;
	public static int maxHp = 200;
	public static int atk = 12;
	public static String name;
	static public void info() {
		So.p("[<"+characterName+">("+currentHp+"/"+maxHp+")]");
	}	
}
