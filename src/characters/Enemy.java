package characters;

import game.Weapon;
import game.WeaponType;

public class Enemy extends Character {
	
	EnemyType type;

	public Enemy() {
		this.type = EnemyType.makeRandomEnemyType();
		this.weapon = Weapon.CreateRandom();
	}

}
