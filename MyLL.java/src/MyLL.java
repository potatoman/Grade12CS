
public class MyLL {
	public StudentInfo frontOfList;
	public int numInList;
	
	
	public MyLL() {
		// Make sure the list is empty!
		frontOfList = null;
		numInList = 0;
	}
	
	
	public void addToFront(StudentInfo studentToAdd) {
		
		if (frontOfList == null) {
			// The list is empty!  So make the item the front of the list.
			studentToAdd.next = null; // Should already be null, but do this just in case!
			frontOfList = studentToAdd;
			numInList = 1;
			return;
		}
		
		// If I get to here, then I have at least one item already in the list.
		// Make the studentToAdd point to the current front item.
		// And then make the studentToAdd the new front item.
		studentToAdd.next = frontOfList;
		frontOfList = studentToAdd;
		numInList++;
		return;
		
	}
	
	public void displayList() {
        if (numInList == 0) {
            System.out.println("The list is empty...");
            return;
        }
        StudentInfo next = this.frontOfList;
        while (next != null) {
            // Print info about `next`
            System.out.println("The student number is " + next.studentNumber);
            System.out.println("The first name is " + next.firstName);
            System.out.println("The last name is " + next.lastName);
            System.out.println("The height is " + next.height);
            System.out.println("The weight is " + next.weight);
            System.out.println("The BMI is " + next.calcBMI());
            System.out.println();

 

            next = next.next;
        }

 

        System.out.println("There are " + this.numInList + " items in the list.");
    }
	
	public void addToRear(StudentInfo studentToAdd) {
		StudentInfo currentStudent = frontOfList;
		for (int i = 0; i < numInList; i++) {
			if (currentStudent.next == null) {
				currentStudent.next = studentToAdd;
				studentToAdd = currentStudent;
				numInList++;
				return;
			} else {
				currentStudent = currentStudent.next;
			}
		}
		
	}
	
	public void removeFromFront() {
		frontOfList = frontOfList.next;
		numInList -= 1;
	}
	public void removeFromRear() {
		StudentInfo currentStudent = frontOfList;
		StudentInfo previousStudent = frontOfList;
		for (int i = 0; i < numInList; i++) {
			if (currentStudent.next == null) {
				previousStudent.next = null;
				numInList -= 1;
				return;
			} else {
				currentStudent = currentStudent.next;
			}
			if (i != 0) {
				previousStudent = previousStudent.next;
			}
		}
	}
}

