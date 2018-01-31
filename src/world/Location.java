package world;

import java.util.Random;

import characters.Player;

public class Location {
	LocationType type;
	String name;
	int enemyLevels;
	boolean friendly;
	
	public Location(String name, int enemyLevels, boolean friendly) {
		this.name = name;
		this.enemyLevels = enemyLevels;
		this.friendly = friendly;
	}
	
	public void createRandomDangerousLocation(Player player) {
		// Create random name
		String[] nameArray = {"Desert", "City of Lam", "Blabla Forest"};
		this.name = nameArray[new Random().nextInt(nameArray.length)];
		this.friendly = false;
		this.enemyLevels = new Random().nextInt(player.getLevel());
	}

}
