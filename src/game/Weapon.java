package game;

import java.util.Random;

public enum Weapon {
	dagger,
	sword,
	staff,
	spear,
	chickenbone;
	
	public int GetDamage() {
		switch(this) {
			case dagger:
				return 20;
			case sword:
				return 40;
			default:
				return 0;
		}
	}

	public static Weapon makeRandomWeapon() {

		Weapon weapon = Weapon.values()[new Random().nextInt(Weapon.values().length)];
		
		return weapon;
	}


}