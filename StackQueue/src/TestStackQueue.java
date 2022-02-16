
public class TestStackQueue {
	

	public static void main(String[] args) {

		MyStack theS = new MyStack();
		MyQueue theQ = new MyQueue();
		
		
		StudentInfo someStudent;
		StudentInfo removedStudent;
		
		
// STACK
		System.out.println("\n\nTESTING THE STACK STUFF");
		
		System.out.println("\nAbout to display the stack (top to bottom)!");
		theS.displayStack();
				
		
		System.out.println("\nAbout to display the stack (top to bottom)!");
		theS.displayStack();
		
		removedStudent = theS.pop();
		if (removedStudent == null) {
			System.out.println("\npopped item is null");
		}
		else {
			System.out.println("\npopped item is " + removedStudent.firstName);
			System.out.println("attribute next has value " + removedStudent.next);
		}
		System.out.println("\nAbout to display the stack (top to bottom)!");
		theS.displayStack();
		
		
// QUEUE
		System.out.println("\n\nTESTING THE QUEUE STUFF");
		
		
		System.out.println("\nAbout to display the queue (front to rear)!");
		theQ.displayQueue();
		
		
		
		System.out.println("\nAbout to display the queue (front to rear)!");
		theQ.displayQueue();
		
		
		removedStudent = theQ.dequeue();
		if (removedStudent == null) {
			System.out.println("\ndequeued item is null");
		}
		else {
			System.out.println("\ndequeued item is " + removedStudent.firstName);
			System.out.println("attribute next has value " + removedStudent.next);
		}
		System.out.println("\nAbout to display the queue (front to rear)!");
		theQ.displayQueue();


	}  // end main

}
