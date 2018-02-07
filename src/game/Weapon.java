package game;

public class Weapon {
	int damage;
	int weight;
	String description;
	
	WeaponType type;
	WeaponQuality quality;
	
	
	public Weapon(WeaponType type) {
		this.type = type;
		this.damage = type.GetBaseDamage();
		if(this.quality != null) {
			this.damage += quality.getModifierDamage(this.quality);
		}
		
		this.description = type.GetDescription();
	}
	public Weapon(WeaponType type, String modifier) {
		this.type = type;
		this.damage = type.GetBaseDamage();
		this.description = type.GetDescription();
	}

	public int getDamage() {
		return this.damage;
	}

	public WeaponType getType() {
		return this.type;
	}
	
	public static Weapon CreateRandom() {
		return new Weapon(WeaponType.Random());
	}

}
