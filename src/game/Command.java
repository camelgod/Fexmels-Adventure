package game;

public enum Command {
	HELP,
	LOOK,
	MOVE,
	SNEAK,
	TALK,
	SHOP;
	
	public static void GetAvailableCommands() {
		System.out.print("Available commands are: ");

		for(int i = 0; i < Command.values().length; i++) {
			System.out.print(Command.values()[i] + " ");
		}
		System.out.print("\n");
	}
	
	public static void ExecuteCommand(Command command, String argument) {
		switch(command) {
		case HELP:
			Menu.HelpMenu(argument);
		case LOOK:
		
		}
		
	}
	public static void ExecuteCommand(Command command) {
		switch(command) {
		case HELP:
			Menu.HelpMenu();
		case LOOK:
			
		
		}
		
	}

}
