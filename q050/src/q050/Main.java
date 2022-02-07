package q050;

import java.util.ArrayList;

public class Main {
	public static void main(String[] args) {
				
		ArrayList<GameObject> gameobjs = new ArrayList<>();		
		gameobjs.add(new Player());		
		gameobjs.add(new Npc());		
		gameobjs.add(new Mob());		
		
	}
}
