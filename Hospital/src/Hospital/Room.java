package Hospital;

import java.util.Arrays;

public class Room {
static int e=0;
private int roomNumber=++e;
	private Doctor doctor;
	private Nurse nurse;
	private Patient[] patients ;
	public final static int MAX_PATIENTS = 5;
	
	
	public Room()	{
		super();
		this.roomNumber=e;
		doctor=new Doctor(this.roomNumber);
		doctor.setRoomNumber(roomNumber);
		nurse=new Nurse(this.roomNumber);
		nurse.setRoomNumber(roomNumber);
	this.patients =  new Patient[MAX_PATIENTS];
		for (int i = 0; i < patients.length; i++) {
			patients[i]=new Patient();
		}
	}
	public int getRoomNumber() {
		return roomNumber;
	}
	public void setRoomNumber(int roomNumber) {
		this.roomNumber = roomNumber;
	}
	public Doctor getDoctor() {
		return doctor;
	}
	public void setDoctor(Doctor doctor) {
		this.doctor = doctor;
	}
	public Nurse getNurse() {
		return nurse;
	}
	public void setNurse(Nurse nurse) {
		this.nurse = nurse;
	}
	public Patient[] getPatients() {
		return patients;
	}
	public void setPatients(Patient[] patients) {
		this.patients = patients;
	}
	
	
	@Override
	public String toString() {
		return "roomNumber " + roomNumber + ", doctor " + doctor.toString() + ", nurse " + nurse.toString() + "\n, patients "
				+Arrays.toString(patients)+ '\n'+'\n'	;
	}
	
	


	
	public int sumDoctors() {
		
		return doctor.getSumDoctor();
	}
	
	
	
}
