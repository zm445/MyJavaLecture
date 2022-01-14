package com.peisia.lol.control;

import com.peisia.lol.data.monster.Goblin;
import com.peisia.lol.data.monster.Orc;
import com.peisia.lol.data.string.Str;
import com.peisia.lol.data.user.User;
import com.peisia.lol.img.Entrance;
import com.peisia.lol.util.So;

public class Game {
	Goblin Goblin1;
	public void start() {
		Entrance.show();
		//케릭터 이름 입력
		User.characterName = Command.getCommand(Str.CMD_GUIDE_CHARACTER_NAME_INPUT);
		//케릭터 성별 입력
		User.characterSex = Command.getCommand(Str.CMD_GUIDE_CHARACTER_SEX_INPUT);
		//케릭터 직업 입력
		User.characterJob = Command.getCommand(Str.CMD_GUIDE_CHARACTER_JOB_INPUT);
		//케릭터 정보 출력
		String s = String.format("당신의 이름은 %s 입니다~\n", User.characterName);
		s += String.format("당신의 성별은 %s 입니다~\n", User.characterSex);
		s += String.format("당신의 직업은 %s 입니다~", User.characterJob);
		So.pl(s);
		
		
		
		Orc orc1 = new Orc("오크전사",100,100,10);
		Orc orc2 = new Orc("오크전사",100,100,10);
		Goblin1 = new Goblin("고블린병사",50,50,5);
		Goblin goblin2 = new Goblin("고블린병사",50,50,5);
		Goblin goblin3 = new Goblin("고블린병사",50,50,5);
		orc1.info();
		orc2.info();
		Goblin1.info();
		goblin2.info();
		goblin3.info();
		
		So.pl("");
		
		gameRun();
	}

	private void gameRun() {
		
		User.info();
		
		boolean isNotEnd = true;
		while(isNotEnd) {
			String cmd = Command.getCommand("");
			switch(cmd) {
			case "exit": 
				isNotEnd = false;
				break;
			}
		}
		
		gameOver();
	}

	private void gameOver() {
		So.pl(Str.MSG_GAME_OVER);
	}
	
}
