package test;

/*
 * Formålet med denne interface er å definere oppførsel som enhver Character må ha.
 */

public interface CharacterBehavior {
	
	int Attack();
	int Sleep();
	int Heal();
	int Talk();

}
