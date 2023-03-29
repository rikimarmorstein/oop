package Hospital;

import java.util.Arrays;

public class Hospital {

	
	String name;
	public final static int MAX_ROOM=10;
	private Room []rooms;
	
	public Hospital() {
		super();
		this.name = "Asuta";
		rooms = new Room[MAX_ROOM];
		for (int i = 0; i < rooms.length; i++) {
			rooms[i]=new Room();
		}
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Room[] getRooms() {
		return rooms;
	}
	public void setRooms(Room[] rooms) {
		this.rooms = rooms;
	}
	@Override
	public String toString() {
		return "Hospital = " + name +'\n'+ "rooms:"+'\n' + Arrays.toString(rooms) ;
	}
	
	


}
