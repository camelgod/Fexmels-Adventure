package test;

/*
 * Formålet med denne interface er å definere oppførsel som enhver Character må ha.
 */

public interface CharacterBehavior {
	
	void Attack(Character target);
	void Sleep(int duration);
	void Heal();
	void Talk(String phrase);
	void Die();

}
