
public class StudentInfo {

	//Attributes
	public int studentNumber;
	public String firstName;
	public String lastName;
	public double height; 
	public double weight; 
	public StudentInfo next;
	
	//Constructor
	
	public StudentInfo() {
		studentNumber = 671014;
		firstName = "Alex";
		lastName = "Serban";
		height = 180;
		weight = 63;
		next = null;
	}
	
public StudentInfo(int sN, String firstName, String lastName, double h, double w) {
		
		studentNumber = sN;
		this.firstName = firstName;
		this.lastName = lastName;
		height = h;
		weight = w;
		next = null; // Don't point to any other student by default.		
	}
	
	
	public int getStudentNumber() {
		return studentNumber;
	}
	
	public String getFirstName() {
		return firstName;
	}
	
	public String getLastName() {
		return lastName;
	}
	
	public void setStudentNumber(int theVal) {
		if (theVal >= 0) {
			studentNumber = theVal;
		}
		else {
			// Negative student number is disallowed!
			studentNumber = 0;  // Default it to 0
			System.out.println("Student number is not allowed to be negative, please enter a positive value.");

		}
	}
}
