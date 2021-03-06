
public class MyQueue {
	
	//Attributes
	StudentInfo front;
	public int numInQueue;
	
	//Constructor
	public MyQueue() {
		front = null;
		numInQueue = 0;
	}
	
	//Methods
	
	public void enqueue(StudentInfo studentToAdd) {
		if (numInQueue == 0) {
			front = studentToAdd;
			numInQueue++;
			return;
		}
		StudentInfo currentStudent = front;
		for (int i = 0; i < numInQueue; i++) {
			if (currentStudent.next == null) {
				currentStudent.next = studentToAdd;
				studentToAdd = currentStudent;
				numInQueue++;
				return;
			} else {
				currentStudent = currentStudent.next;
			}
		}
	}
	
	public void displayQueue() {
		if (numInQueue == 0) {
			System.out.println("The queue is empty");
			return;
		}
		StudentInfo nextVal = front;
        while (nextVal != null) {
        	System.out.println(nextVal.firstName);
        	System.out.println(nextVal.studentNumber);
        	
        	nextVal = nextVal.next;
        }
	}
	
	public StudentInfo dequeue() {
		if (numInQueue == 0) {
			
				return null;
		} else {
			numInQueue--;
			StudentInfo removedFront = front;
			front = front.next;
			return removedFront;
			
		}
	}
}