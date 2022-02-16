
public class MyBinaryTree {
	//Attributes
	int numInTree;
	StudentInfo root;
	
	//Constructor
	public MyBinaryTree () {
		numInTree = 0;
		root = null;
	}
	
	//Methods
	public void addToTree(StudentInfo currentRoot, StudentInfo studentToAdd) {
		if (numInTree == 0) {
			root = studentToAdd;
			numInTree++;
		} else {
			//Checks to see if it is less than the current root and if it is will add to the left
			if (studentToAdd.getStudentNumber() < currentRoot.getStudentNumber()) {
				if (currentRoot.left == null) {
					currentRoot.left = studentToAdd;
					numInTree++;
					return;
					//If it is less than current root but it already has a value, will go into recursive call
				} else {
					addToTree (currentRoot.left, studentToAdd);
				}
			} //Checks to see if it is greater than current root and if it is will add to the right
			if (studentToAdd.getStudentNumber() > currentRoot.getStudentNumber()) {
				if (currentRoot.right == null) {
					currentRoot.right = studentToAdd;
					numInTree++;
					return;
				//If it is greater than current root but it already has a value, will go into recursive call
				} else {
					addToTree (currentRoot.right, studentToAdd);
				}
			}
		}
	}//end of addToTree
	
	public void preorder(StudentInfo currentRoot) {
		if (numInTree == 0) {
			System.out.println("The tree is currently empty");
		}
		//Process current root, go down left subtree, go down right subtree
		System.out.println(currentRoot.studentNumber);
		if (currentRoot.left != null) {
			preorder(currentRoot.left);
		} else if(currentRoot.right != null) {
			preorder(currentRoot.right);
		} else {
			return;
		}
	}//end of preorder
	
	public void postorder(StudentInfo currentRoot) {
		if (numInTree == 0) {
			System.out.println("The tree is currently empty");
		}
		//Go down left subtree, go down right subtree, process current root
		if (currentRoot.left != null) {
			postorder(currentRoot.left);
		} else if (currentRoot.right != null) {
			postorder(currentRoot.right);
		} else {
			System.out.println(currentRoot.studentNumber);
			return;
		}
	}//end of postorder
	
	public void inorder(StudentInfo currentRoot) {
		if (numInTree == 0) {
			System.out.println("The tree is currently empty");
			return;
		}
		//Go down left subtree, process current root, go down right subtree
		if (currentRoot.left != null) {
			inorder (currentRoot.left);
		}
		System.out.println(currentRoot.studentNumber);
		if (currentRoot.right != null) {
			inorder (currentRoot.right);
		}
		return;
	}//end of inorder
	
	
}
