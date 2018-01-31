package characters;

import game.Weapon;

public class Player extends Character {

	private char gender;

	public Player(String name) {
		this.name = name;
		// Always spawn player with chickenbone
		this.weapon = Weapon.chickenbone;
		
		System.out.println(this.name + " was spawned into the world.");
		System.out.println(this.name + " is confused, but is holding a " + this.weapon + " with " + this.weapon.GetDamage() + " damage to defend ");
	}
	
	public void setGender(char characterGender) {
		if(characterGender == 'm' || characterGender == 'f' || characterGender == 'M' || characterGender == 'F'){
			this.gender = characterGender;
		} else {
		}
	}

}
