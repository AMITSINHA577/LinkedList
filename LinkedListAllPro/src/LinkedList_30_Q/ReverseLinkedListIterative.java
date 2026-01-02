package LinkedList_30_Q;

public class ReverseLinkedListIterative {

	nodeLinks<Integer> head;

	public void createAndPrint(int data) {
		nodeLinks<Integer> newNodeData = new nodeLinks<Integer>(data);

		if (head == null) {
			head = newNodeData;
			return;
		}

		newNodeData.next = head;
		head = newNodeData;
	}

	public nodeLinks<Integer> reverseIterative() {
		// Current node starts from head
		nodeLinks currectN = head;

		// Previous node initially null
		nodeLinks preN = null;

		// Traverse the list
		while (currectN != null) {

			// Store next node
			nodeLinks nextN = currectN.next;

			// Reverse the link
			currectN.next = preN;

			// Move previous to current
			preN = currectN;

			// Move current to next
			currectN = nextN;
		}

		// Update head after reversal
		head = preN;

		// Return new head
		return head;
	}

	public void printData() {
		nodeLinks<Integer> temp = head;

		// Traverse till last node
		while (temp != null) {
			System.out.println(temp.data);
			temp = temp.next;
		}
	}


	public static void main(String[] args) {
		// Main method execution starts here

		ReverseLinkedListIterative obj = new ReverseLinkedListIterative();

		// Creating linked list
		obj.createAndPrint(10);
		obj.createAndPrint(20);
		obj.createAndPrint(30);
		obj.createAndPrint(40);

		// Printing original list
		obj.printData();

		System.out.println("After rever the list....");

		// Reversing the list
		obj.reverseIterative();

		// Printing reversed list
		obj.printData();
	}
}