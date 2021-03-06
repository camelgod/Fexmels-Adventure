package characters;

import game.Weapon;
import game.WeaponType;
import world.Location;

/*
 * 
 */
public class Character implements CharacterBehavior {

	int hp;
	protected int level;
	int experience;
	String name;
	Weapon weapon;
	Location location;
	
	public Character() {
		
	}
	
	@Override
	public void Attack(Character target) {

	}

	@Override
	public void Sleep(int duration) {
	}


	@Override
	public void Heal() {

	}

	@Override
	public void Talk(String phrase) {
		System.out.println(this.name + " says: " + phrase);
	}

	@Override
	public void Die() {
		// give experience to player and kill enemy
	}
	
	public Weapon getWeapon() {
		return this.weapon;
	}
	
	public int getLevel() {
		return this.level;
	}

	public Location GetLocation() {
		return this.location;
	}

}
