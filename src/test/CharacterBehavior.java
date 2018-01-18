package test;

/*
 * Formålet med denne interface er å definere oppførsel som enhver Character må ha.
 */

public interface CharacterBehavior {
	
	void Attack();
	void Sleep();
	void Heal();
	void Talk();
	void Die();

}
