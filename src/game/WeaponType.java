package game;

import java.util.Random;

public enum WeaponType {
	DAGGER,
	SWORD,
	STAFF,
	SPEAR,
	CHICKENBONE;
	
	public int GetBaseDamage() {
		switch(this) {
			case DAGGER:
				return 20;
			case SWORD:
				return 40;
			case CHICKENBONE:
				return 50;
			default:
				return 0;
		}
	}
	public String GetDescription() {
		switch(this) {
			case DAGGER:
				return "A small dagger. Lightweight but capable";
			case SWORD:
				return "A traditional sword. Medium weight";
			case CHICKENBONE:
				return "A small bone of a chicken.";
			default:
				return "That\'s not what we concider a weapon!";
		}
	}

	public static WeaponType Random() {
		return WeaponType.values()[new Random().nextInt(WeaponType.values().length)];
	}


}