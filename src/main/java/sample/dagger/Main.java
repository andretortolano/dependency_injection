package sample.dagger;

import sample.dagger.rpg.Warrior;

public class Main {

	public static void main(String[] args) {
		System.out.println("----------- START");
		Warrior warrior = new Warrior();
		warrior.takeDamage(10);
		warrior.takeDamage(5);
		warrior.takeDamage(20);
	}

}
