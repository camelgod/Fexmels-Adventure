package world;

import java.util.Random;

public enum LocationType {
	CITY,
	SWAMP,
	DESERT,
	FOREST,
	RUIN,
	BADLANDS;
	
	public static LocationType random() {
		return LocationType.values()[new Random().nextInt(LocationType.values().length)];
	}
}
