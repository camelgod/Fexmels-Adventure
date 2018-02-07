package world;

import java.util.Random;

import characters.Player;

public class Location {
	LocationType type;
	String name;
	int enemyLevels;
	boolean friendly;
	String description;
	
	public Location(String name, int enemyLevels, boolean friendly) {
		this.name = name;
		this.enemyLevels = enemyLevels;
		this.friendly = friendly;
		this.description = "TEST Location";
	}
	
	public void createRandomDangerousLocation(Player player) {
		// Create random name
		String[] nameArray = {"Desert", "City of Lam", "Blabla Forest"};
		

		this.name = nameArray[new Random().nextInt(nameArray.length)];
		this.description = (this.name + " sure looks dangerous!");
		this.friendly = false;
	}

	public String Describe() {
		return this.description;
	}
}
