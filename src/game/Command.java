package game;

import game.*;

public enum Command {
	HELP,
	LOOK,
	MOVE,
	SNEAK,
	TALK,
	UNKNOWN;
	
	public static void GetAvailableCommands() {
		System.out.print("Available commands are: ");

		for(int i = 0; i < Command.values().length; i++) {
			System.out.print(Command.values()[i] + " ");
		}
		System.out.print("\n");
	}
	
	public static boolean Contains(String command) {
		for(Command c : Command.values()) {
	        if (c.name().equals(command)) {
	            return true;
	        }
		}
		return false;
	}
	
	public static void ExecuteCommand(Command command, String argument) {
		switch(command) {
		case HELP:
			Menu.HelpMenu(argument);
			break;
		default:
			Menu.HelpMenu();
		}
		
	}
	public static void ExecuteCommand(Command command) {
		switch(command) {
		case HELP:
			Menu.HelpMenu();
			break;
		case LOOK:
			System.out.println("You look around and see " + Game.player.GetLocation().Describe());
			break;
		case MOVE:
			System.out.println("You move");
			break;
		case SNEAK:
			System.out.println("You sneak");
			break;
		case TALK:
			System.out.println("You talk");
			break;
		case UNKNOWN:
			Menu.HelpMenu();
		default:
			Menu.HelpMenu();
		}
		Menu.GetCommand();
	}
}
