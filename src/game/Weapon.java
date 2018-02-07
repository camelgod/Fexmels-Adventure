package game;

public class Weapon {
	int damage;
	int weight;
	String description;
	WeaponType type;
	
	public Weapon(WeaponType type) {
		this.type = type;
		this.damage = type.GetDamage();
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
