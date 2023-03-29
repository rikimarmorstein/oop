package Hospital;

public class Nurse extends Person{

	private static int num=1;
	private int roomNumber;
	private int nurseNumber=1;
	private int samNurse = 0;
	public Nurse(int roomNumber) {
		super();
		this.roomNumber = roomNumber;
		this.nurseNumber = num++;
		++samNurse;

	}

	public int getRoomNumber() {
		return roomNumber;
	}

	public void setRoomNumber(int roomNumber) {
		this.roomNumber = roomNumber;
	}

	@Override
	public String toString() {
		return "Id" + super.getId()+ ", name Nurse " + nurseNumber + ", age" + super.getAge() + ", belong to room number "+roomNumber;
	}

	public int getSamNurse() {
		return samNurse;
	}
	
	
}
