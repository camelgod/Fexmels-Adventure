package characters;

import java.util.Random;

public enum EnemyType {
	zombie,
	spook;
	
	int GetHp() {
		switch(this) {
		case zombie:
			return 40;
		case spook:
			return 40;
		default:
			return 1;
		}

	}
	public static EnemyType makeRandomEnemyType() {

		EnemyType type = EnemyType.values()[new Random().nextInt(EnemyType.values().length)];
		
		return type;
	}

}
