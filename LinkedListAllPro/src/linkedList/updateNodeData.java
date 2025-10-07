package linkedList;

public class updateNodeData {

	Node<Integer> head; // head node of the linked list

	// Insert a new node at the head of the linked list
	public void insertAtHead(int data) {
		Node<Integer> newNode = new Node<>(data);

		if (head == null) {
			head = newNode;
			System.out.println("Inserted " + data + " as the head node.");
			return;
		}

		newNode.next = head;
		head = newNode;
		System.out.println("Inserted " + data + " at the head of the list.");
	}

	// Update the data value at a given position (1-based index)
	public void updateNodeDataAtPosition(int position, int newValue) {
		if (head == null) {
			System.out.println("Linked list is empty. No nodes to update.");
			return;
		}

		if (position <= 0) {
			System.out.println("Invalid position! Position should be >= 1.");
			return;
		}

		Node<Integer> temp = head;
		int currentPosition = 1;

		// Traverse to the given position
		while (temp != null && currentPosition < position) {
			temp = temp.next;
			currentPosition++;
		}

		// If node found at the position
		if (temp != null) {
			temp.data = newValue;
			System.out.println("Node at position " + position + " updated successfully. ");
		} else {
			System.out.println("Position " + position + " is out of range. No update performed.");
		}
	}

	// Print all nodes of the linked list
	public void printLinkedList() {
		if (head == null) {
			System.out.println("Linked list is empty.");
			return;
		}

		System.out.println("\nCurrent Linked List:");
		Node<Integer> temp = head;
		while (temp != null) {
			System.out.print(temp.data + " -> ");
			temp = temp.next;
		}
		System.out.println("null");
	}

	// Main method to test the linked list functionality
	public static void main(String[] args) {
		updateNodeData list = new updateNodeData();

		System.out.println("=== Inserting Nodes ===");
		list.insertAtHead(10);
		list.insertAtHead(20);
		list.insertAtHead(30);
		list.insertAtHead(40);
		list.printLinkedList();

		System.out.println("\n=== Updating Node Data ===");
		list.updateNodeDataAtPosition(2, 70); // update 2nd node
		list.printLinkedList();

		System.out.println("\n=== Trying invalid update ===");
		list.updateNodeDataAtPosition(10, 99); // invalid position
	}
}
