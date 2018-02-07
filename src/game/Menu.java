package game;

import java.util.ArrayList;

import java.util.Scanner;
import game.*;

public class Menu {

	static Scanner sc = new Scanner(System.in);
	
	public Menu(String text, String args[])  {
	}
	
	public static String CreateStringMenu(String text) {
		System.out.print(text + " ");
		String reply = sc.next();
		sc.nextLine();
		return reply;
	}

	public static void GetCommand() {
		System.out.print("Enter command: ");
		String reply = sc.nextLine().toUpperCase();
		
		if(Command.Contains(reply)) {
			if(reply.contains(" ")) {
				Command command = Command.valueOf(reply.substring(0, reply.indexOf(" ")));
				String argument = reply.substring(reply.indexOf(" ") + 1);
				Command.ExecuteCommand(command, argument);
			} else {
				Command.ExecuteCommand(Command.valueOf(reply));
			}
		} else {
			// Print Help menu if command is unrecognized
			Menu.HelpMenu();
		}
	}

	public static char CreateCharMenu(String text) {
		System.out.print(text + " ");
		char reply = sc.next().charAt(0);
		sc.nextLine();
		return reply;
	}
	
	public static Integer CreateMultiMenu(String text, String options[]) {
		System.out.println(text + " ");
		
		ArrayList<Integer> optionArray = new ArrayList<Integer>();

		for(int x = 0; x < options.length; x++) {
			System.out.println(x + ": " + options[x]);
			optionArray.add(x);
		}

		int reply = sc.nextInt();
		sc.nextLine();
		if(reply > options.length || reply > 0) {
			System.out.println("Invalid input!");
			Menu.CreateMultiMenu(text, options);
		}

		System.out.println(Integer.toString(reply) + " (" + options[reply] + ") was selected.");
		return optionArray.get(reply);
	}
	
	public static void HelpMenu(String argument) {
		argument = argument.toLowerCase();
		switch(argument) {
		case "weapon":
		case "weapons":
			System.out.println("You are currently wielding " + Game.player.getWeapon() + " which has damage of " + Game.player.getWeapon().getDamage());
		}
		
		GetCommand();
		
		
	}
	public static void HelpMenu() {
		System.out.println("## General Help Menu ##");
		Command.GetAvailableCommands();
		System.out.println("To get specific help, use command \"HELP [word]\".\nFor example \"HELP weapons\"");
		GetCommand();
	}

}
