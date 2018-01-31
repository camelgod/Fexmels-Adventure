package characters;

import game.Weapon;

public class Enemy extends Character {
	
	EnemyType type;

	public Enemy() {
		this.type = EnemyType.makeRandomEnemyType();
		this.weapon = Weapon.makeRandomWeapon();
	}

}
