package game;

import characters.Player;

/* 
 * Denne klassen inneholder spillets logikk
 * Main loop, kall til menyer og initialisering skjer her
 * 
 */

public class Game {
	
	public static Player player;
	public static boolean debug = false;
	

	public static void Initialize() {
			player = new Player(Menu.CreateStringMenu("Please enter your name: "));
			player.SpawnRandom();
			// player.setGender(Menu.CreateCharMenu("What is your gender?: "));
			// Menu.CreateMultiMenu("Welcome to the tavern!\nWhat would you like to do?: ", new String[]{"Sleep", "Eat"});
	}
	


	public static void main(String[] args) {
		Initialize();
		Menu.GetCommand();
		
	}

}