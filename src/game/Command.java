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
	

}
