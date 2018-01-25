package test;

import java.util.Scanner;

/* 
 * Denne klassen inneholder spillets logikk
 * Main loop, kall til menyer og initialisering skjer her
 * 
 */

public class Game {

	public static void Initialize() {
			Player p1 = new Player(Menu.CreateStringMenu("Please enter your name: "));
			p1.setGender(Menu.CreateCharMenu("What is your gender?: "));
			
			Menu.CreateMultiMenu("Welcome to the tavern!\nWhat would you like to do?: ", new String[]{"Sleep", "Eat"});
	}


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Initialize();

	}

}
