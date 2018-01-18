package test;

/*
 * 
 */
public class Character implements CharacterBehavior {

	int hp;
	int level;
	int experience;
	String name;
	Weapon weapon;
	
	public Character() {
		
	}
	
	@Override
	public void Attack() {

	}

	@Override
	public void Sleep() {
	}


	@Override
	public void Heal() {

	}

	@Override
	public void Talk() {

	}

	@Override
	public void Die() {
		// give experience to player and kill enemy
		
	}

}
