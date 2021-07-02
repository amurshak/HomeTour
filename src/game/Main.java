package game;
import java.util.Scanner;

import fixtures.Room;


public class Main {
	
	public static void main(String[] args) {
		
		RoomManager rm = new RoomManager();
		rm.init();
		Scanner scan = new Scanner(System.in);
		String input = "";
		Room currentRoom = rm.startingRoom;
		do {
			System.out.println(currentRoom.name);
			System.out.println("Where do you want to go?");
			input = scan.nextLine();
			Room nextRoom = currentRoom.getExit(input);
			if(nextRoom != null) {
				currentRoom = nextRoom;
			}
 
		} while (!input.equals("quit"));
	}
	
	private static void printRoom(Player player) {
		System.out.println(currentRoom.name);

	}

	private static String[] collectInput() {
		
	}
		
	private static void parse(String[] command, Player player) {

	}

}
