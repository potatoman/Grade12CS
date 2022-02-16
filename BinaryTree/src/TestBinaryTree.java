
public class TestBinaryTree {
	
	public static void main(String[] args) {
		
		MyBinaryTree theTree = new MyBinaryTree ();
		StudentInfo someStudent;
		
		
		someStudent = new StudentInfo(20, "Daffy", "Duck");
		theTree.addToTree(theTree.root, someStudent);
		
		someStudent = new StudentInfo(15, "Tweety", "Bird");
		theTree.addToTree(theTree.root, someStudent);
		
		someStudent = new StudentInfo(30, "Bugs", "Bunny");
		theTree.addToTree(theTree.root, someStudent);
		
		someStudent = new StudentInfo(10, "Elmer", "Fudd");
		theTree.addToTree(theTree.root, someStudent);
		
		someStudent = new StudentInfo(17, "Foghorn", "Longhorn");
		theTree.addToTree(theTree.root, someStudent);
		
		//https://www.youtube.com/watch?v=aXvQMfKjuC8 <-- Always gets me to giggle
		someStudent = new StudentInfo(40, "Yosemite", "Sam");
		theTree.addToTree(theTree.root, someStudent);
		
		someStudent = new StudentInfo(1, "Marvin", "The Martian");
		theTree.addToTree(theTree.root, someStudent);
		
		someStudent = new StudentInfo(8, "Porky", "Pig");
		theTree.addToTree(theTree.root, someStudent);
		
		someStudent = new StudentInfo(32, "Sylvester", "The cat");
		theTree.addToTree(theTree.root, someStudent);
		
		someStudent = new StudentInfo(35, "Sylvester", "Jr.");
		theTree.addToTree(theTree.root, someStudent);
		
		System.out.println("INORDER");
		theTree.inorder(theTree.root);
		System.out.println("PREORDER");
		theTree.preorder(theTree.root);
		System.out.println("POSTORDER");
		theTree.postorder(theTree.root);
	}
	
	
	
	
	
	
	
	
}
