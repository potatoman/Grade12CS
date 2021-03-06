
public class TestList {

	public static void main(String[] args) {
		
		MyLL theLL = new MyLL(); // Instantiate a linked list.
		
		StudentInfo someStudent;
		
		someStudent = new StudentInfo(222222, "Daffy", "Duck", 140.0, 40.0);		
		theLL.addToFront(someStudent);
		
		someStudent = new StudentInfo(888888, "Lola", "Bunny", 160.0, 45.0);
		theLL.addToFront(someStudent);
		
		someStudent = new StudentInfo(123456, "Foghorn", "Leghorn", 260.0, 120.0);
		theLL.addToFront(someStudent);
		
		someStudent = new StudentInfo(999999, "Tweety", "Bird", 10, 0.2);
		theLL.addToFront(someStudent);
		
		someStudent = new StudentInfo(111111, "Marvin", "Martian", 40, 10);
		theLL.addToRear(someStudent);
		
		theLL.removeFromFront();
		theLL.removeFromRear();
				
		theLL.displayList();
		

	}
}
