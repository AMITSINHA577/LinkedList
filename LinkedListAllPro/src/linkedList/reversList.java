package linkedList;

public class reversList {

	Node<Integer> head;

	public void insertInToTop(int data) {
		Node<Integer> newHead = new Node(data);

		if (head == null) {
			head = newHead;
			return;
		}

		newHead.next = head;
		head = newHead;
	}

	// Reverse the linked list
	public Node<Integer> reversLinkedList() {

		Node<Integer> current = head; // Start from head
		Node<Integer> prev = null; // Previous pointer (initially null)

		while (current != null) { // Traverse until end
			Node<Integer> nextNode = current.next; // Save next node
			current.next = prev; // Reverse link (current points to prev)
			prev = current; // Move prev ahead
			current = nextNode; // Move current ahead
		}

		head = prev; // After loop, prev becomes the new head
		return head; // Return new head
	}

	
	// Print all data in the linked list
	public void printData() {
		Node<Integer> temp = head;
		while (temp != null) {
			System.out.println(temp.data);
			temp = temp.next;
		}
	}

	public static void main(String[] args) {
		reversList list = new reversList();

		// Insert some data
		list.insertInToTop(10);
		list.insertInToTop(20);
		list.insertInToTop(30);
		list.insertInToTop(40);

		System.out.println("Original List:");
		list.printData();

		list.reversLinkedList(); // Reverse the list

		System.out.println("\nReversed List:");
		list.printData();
	}
}