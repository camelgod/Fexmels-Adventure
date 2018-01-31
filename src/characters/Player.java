package characters;

import game.Command;
import game.Game;
import game.Weapon;

public class Player extends Character {

	private char gender;

	public Player(String name) {
		this.name = name;
		// Always spawn player with chickenbone
		this.weapon = Weapon.chickenbone;

		if(Game.debug == false) {
			System.out.println(this.name + " was spawned into the world.");
			System.out.println(this.name + " is confused, but is holding a " + this.weapon + " with " + this.weapon.GetDamage() + " damage to defend ");
		}
	}
	
	public void setGender(char characterGender) {
		if(characterGender == 'm' || characterGender == 'f' || characterGender == 'M' || characterGender == 'F'){
			this.gender = characterGender;
		} else {
		}
	}
	
	public void Do(Command command, String argument) {
		Command.ExecuteCommand(command, argument);
	}

	public void Do(Command command) {
		Command.ExecuteCommand(command);
	}

}
