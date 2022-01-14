package com.peisia.lol.data.monster;

import com.peisia.lol.data.user.User;
import com.peisia.lol.util.Dice;
import com.peisia.lol.util.So;

public class Goblin {
	String name;
	int currentHp;
	int maxHp;
	int atk;
	
	public Goblin(String name, int currentHp, int maxHp, int atk) {
		this.name = name;
		this.currentHp = currentHp;
		this.maxHp = maxHp;
		this.atk = atk;
	}

	public void info() {
		So.p("[<"+name+">("+currentHp+"/"+maxHp+")]");
	}
	
	public void attack() {
		int damage = Dice.getDice(atk);
		User.currentHp -= damage;
		So.pl(name + " 이" + User.name + " 에게" + damage + " 피해를 입혔습니다.");
	}
}
