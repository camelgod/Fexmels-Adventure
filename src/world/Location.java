package world;

import java.util.ArrayList;
import java.util.Random;

import characters.Player;

public class Location {
	
	public static ArrayList<Location> visitedLocations = new ArrayList<Location>();
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
		String[] nameArray = {"Balala", "Spookytown", "Blabla Forest"};
		this.type = LocationType.random();
		this.name = nameArray[new Random().nextInt(nameArray.length)];
		this.description = (this.name + " sure looks dangerous!");
		this.friendly = false;
	}
	
	public static Location GenerateRandom(String name, LocationType type, boolean friendly) {
		String[] nameArray = {"Balala", "Spookytown", "Blabla Forest"};
		Location loc = new Location(nameArray[new Random().nextInt(nameArray.length)],
				1, false);

		loc.name = name;
		loc.type = type;
		loc.friendly = friendly;
		if(loc.friendly) {
			loc.description = (loc.name + " is a peaceful " + loc.type.toString());
		} else {
			loc.description = (loc.name + " is a dangerous " + loc.type.toString() + " full of level " + loc.enemyLevels + " enemies.");
		}
		return loc;
	}
	


	public String Describe() {
		return this.description;
	}
}
