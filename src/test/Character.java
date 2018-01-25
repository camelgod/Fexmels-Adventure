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
	public void Attack(Character target) {

	}

	@Override
	public void Sleep(int duration) {
	}


	@Override
	public void Heal() {

	}

	@Override
	public void Talk(String phrase) {
		System.out.println(this.name + " says: " + phrase);
	}

	@Override
	public void Die() {
		// give experience to player and kill enemy
	}

}
