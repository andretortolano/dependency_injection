package sample.dagger.rpg;

public class SimpleArmor {
	private int armor = 2;
	private int integrity = 15;
	
	public int getFisicalDefense() {
		return armor;
	}
	
	public boolean isBroken() {
		return integrity <= 0;
	}
	
	public int tankDamage(int damage) {
		if(integrity > 0) {
			integrity -= damage;
			System.out.println("SimpleArmor Took " + damage + " damage.");
			if(isBroken()) {
				System.out.println("SimpleArmor is broken.");
			} else {
				System.out.println("SimpleArmor's integrity is at " + integrity);
			}
			return (damage - armor) > 0 ? damage - armor: 0;	
		} else {
			return damage;
		}
	}
}
