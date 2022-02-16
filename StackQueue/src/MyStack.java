
public class MyStack {
	//Attributes
	public int numInStack;
	public StudentInfo top;
	
	
	//Constructor
	public MyStack() {
		numInStack = 0;
		top = null;	
	}
	
	//Methods
	public void push(StudentInfo newTop) {
		StudentInfo oldTop;
		oldTop = top;
		top = newTop;
		top.next = oldTop;
		numInStack++;
		return;
	}
	
	public void displayStack() {
		if (numInStack == 0) {
			System.out.println("The stack is empty");
			return;
		}
		StudentInfo nextVal;
		nextVal = top;
		while (nextVal != null) {
			System.out.println(nextVal.firstName);
			System.out.println(nextVal.studentNumber);
			nextVal = nextVal.next;
			}
	}
	//put safeguard for if it is the only value in the list
	public StudentInfo pop() {
		if (numInStack == 0) {
			return null;
		}
		StudentInfo removedTop = top;
		if (numInStack == 1) {
			removedTop.next = top;
			top.next = null;
			removedTop.next = removedTop;
			numInStack--;
			return removedTop.next;
		}
		StudentInfo previousTop;
		previousTop = top.next;
		removedTop.next = top;
		top.next = null;
		top = previousTop;
		numInStack--;
		return removedTop;
	}
	
	
	public StudentInfo peek() {
		return top;
	}
}
