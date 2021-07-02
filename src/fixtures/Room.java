package fixtures;

public class Room extends Fixture{
	
	
	
	public Room[] exits;

	public Room(String name, String shortDescription, String longDescription) {
		this.exits = new Room[4]; // size is your choice
	}
	
	public Room[] getExits() {
		return null;
	}
		
	public Room getExit(String direction) {
		return null;
	}
	
}

