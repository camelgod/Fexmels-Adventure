package game;

import java.util.ArrayList;
import java.util.Scanner;

public class Menu {

	private String text;
	private int options;
	
	static Scanner sc = new Scanner(System.in);
	
	public Menu(String text, String args[])  {
	}
	
	public static String CreateStringMenu(String text) {
		System.out.print(text + " ");
		String reply = sc.next();
		return reply;
	}

	public static char CreateCharMenu(String text) {
		System.out.print(text + " ");
		char reply = sc.next().charAt(0);
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
		if(reply > options.length || reply > 0) {
			System.out.println("Invalid input!");
			Menu.CreateMultiMenu(text, options);
		}

		System.out.println(Integer.toString(reply) + " (" + options[reply] + ") was selected.");
		return optionArray.get(reply);
	}

}
