package day_18_11;

public class HospitalManagementSystem {

	public static void main(String[] args) {
		Doctor d=new Doctor("ABC", 56, "Checking Patient", "HeartSpecialist");
		d.work();
		
		
		Nurse n=new Nurse("xyz", 45, "admin", 3);
		n.work();

	}

}
