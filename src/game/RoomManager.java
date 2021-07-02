package game;

import fixtures.Room;

public class RoomManager {
	Room[] house;
	Room startingRoom;
	
	public void init() {
		Room liv = new Room("Living room", "The living room", "You enter the living room  and see a sofa, a lamp, and a television on the wall.");
		Room kit = new Room("Kitchen", null, null);
		Room lib = new Room("Library", null, null);
		Room bed = new Room("Bedroom", null, null);
		
		
		liv.exits[0] = kit;
		kit.exits[1] = liv;
		
		this.startingRoom = liv;
		this.house = new Room[2];
		house[0] = liv;
		house[1] = kit;
	}

}
