package com.Riot.lol;

import com.Riot.lol.util.Dice;
import com.Riot.lol.control.*;

public class Main {
	public static void main(String[] args) {
		
		
		int result = Dice.ran();
		
		System.out.println(result);
		
		System.out.println("-----------------");
		
		String result2 = Game.start();
		
		System.out.println(result2);
		
		
	}
}
