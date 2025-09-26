package linkedList;

public class insertAtAnyPoint {

	// Node class yaha pe InsertInHead me bani hui use ho rahi h
	// Insert at a specific position (0-based index)

	Node<Integer> head;

	public void insertPoint(int data, int position) {
		Node<Integer> newNode = new Node<Integer>(data); // Node class yaha pe InsertInHead me bani hui use ho rahi h

		if (position == 0) {
			newNode.next = head;
			head = newNode;
			System.out.println("Insertion at position " + position + " is successful");
			return;
		}

		Node<Integer> temp = head;
		int currentPos = 0;

		while (temp != null && currentPos < position - 1) {
			temp = temp.next;
			currentPos++;
		}

		if (temp == null) {
			System.out.println("Position out of range");
			return;
		}

		newNode.next = temp.next;
		temp.next = newNode;

	}

	// Helper method to print list contents
	public void printList() {
		Node<Integer> temp = head;
		while (temp != null) {
			System.out.print(temp.data + " -> ");
			temp = temp.next;
		}
		System.out.println("null");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		insertAtAnyPoint obj1 = new insertAtAnyPoint();
		obj1.insertPoint(10, 0);
		obj1.insertPoint(20, 1);
		obj1.insertPoint(30, 2);
		obj1.insertPoint(40, 3);
		obj1.printList();
		
		obj1.insertPoint(80, 2);
		obj1.printList();
	}

}
