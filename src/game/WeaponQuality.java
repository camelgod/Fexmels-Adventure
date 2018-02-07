package game;

public enum WeaponQuality {
	BRONZE,
	OBSIDIAN,
	DIRTY,
	GOLDEN,
	STEEL;
	
	public int getModifierDamage(WeaponQuality quality) {
		switch(quality) {
		case DIRTY:
			return -5;
		case BRONZE:
			return 10;
		case GOLDEN:
			return 15;
		case STEEL:
			return 25;
		case OBSIDIAN:
			return 40;
		default:
			return 0;
		}
	}
}
