package characters;

import game.Command;
import game.Game;
import game.Weapon;
import game.WeaponType;
import world.Location;
import static world.LocationType.*;

public class Player extends Character {

	private char gender;

	public Player(String name) {
		this.name = name;
		// Always spawn player with chickenbone
		this.weapon = new Weapon(WeaponType.CHICKENBONE);
		this.level = 0;
		

		if(Game.debug == false) {
			System.out.println(this.name + " was spawned into the world.");
			System.out.println(this.name + " is confused, but is holding a " + this.weapon.getType().toString() + " with " + this.weapon.getDamage() + " damage to defend ");
		}
	}
	
	public void setGender(char characterGender) {
		if(characterGender == 'm' || characterGender == 'f' || characterGender == 'M' || characterGender == 'F'){
			this.gender = characterGender;
		} else {
		}
	}
	
	public void Spawn(Location loc) {
		this.location = loc;
	}
	public void SpawnRandom() {
		this.location = Location.GenerateRandom("Cozy Castle", CITY, true);
	}

}
