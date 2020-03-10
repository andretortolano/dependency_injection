package sample.dagger.rpg;

public class Warrior {
	private int life;
	
	private SimpleArmor simpleArmor;
	
	public Warrior() {
		life = 30;
		simpleArmor = new SimpleArmor();
	}
	
	public int getLife() {
		return life;
	}
	
	public boolean isAlive() {
		return life > 0;
	}

	public void takeDamage(int damage) {
		int restOfdamage = simpleArmor.tankDamage(damage);
		System.out.println("Warrior received " + restOfdamage + " as true damage.");
		life -= restOfdamage;
	
		if(isAlive()) {
			System.out.println("Warrior is still alive.\n");	
		} else {
			System.out.println("Warrior is dead for sure.\n");
		}
	}
}
