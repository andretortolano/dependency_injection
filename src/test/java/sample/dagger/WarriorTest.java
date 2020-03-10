package sample.dagger;

import org.junit.Test;

import sample.dagger.rpg.Warrior;

import org.junit.Assert;

public class WarriorTest {
	
    @Test public void testWarriorTakeDamageWith2Armor() {
    	Warrior warrior = new Warrior();	
    	// Given
    	int life = warrior.getLife();
    	int damage = 10;
    	int trueDamage = 8;
    	// When
        warrior.takeDamage(damage);
        // Then
        Assert.assertEquals(life - trueDamage, warrior.getLife());
    }
    
    @Test public void testWarriorTakeDamageWith0Armor() {
    	Warrior warrior = new Warrior();	
    	// Given
    	int life = warrior.getLife();
    	int damage = 10;
    	// When
        warrior.takeDamage(damage);
        // Then
        Assert.assertEquals(life - damage, warrior.getLife());
    }
}
