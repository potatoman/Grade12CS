
public class StudentInfo {
	
	//Attributes
	public int studentNumber;
	public String firstName;
	public String lastName;
	public StudentInfo left;
	public StudentInfo right;
	
	//Constructor
	
	public StudentInfo() {
		studentNumber = 671014;
		firstName = "Alex";
		lastName = "Serban";
		left = null;
		right = null;
	}
	
	public StudentInfo(int sN, String firstName, String lastName) {
		
		studentNumber = sN;
		this.firstName = firstName;
		this.lastName = lastName;
		left = null;
		right = null;
	}
	
	//Methods
	public int getStudentNumber() {
		return studentNumber;
	}
	
	public String getFirstName() {
		return firstName;
	}
	
	public String getLastName() {
		return lastName;
	}

}
