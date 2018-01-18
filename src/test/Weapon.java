package test;

public enum Weapon {
	dagger,
	sword,
	staff,
	spear,
	chickenbone;
	
	int GetDamage() {
		switch(this) {
			case dagger:
				return 20;
			case sword:
				return 40;
			default:
				return 0;
		}
	}

}
