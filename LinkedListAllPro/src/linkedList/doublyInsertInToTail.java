package linkedList;

public class doublyInsertInToTail {

	doublyNode<Integer> head;

	private void insertInToHeadDoubly(int data) {

		doublyNode<Integer> newNode = new doublyNode(data);

		if (head == null) {
			head = newNode;
			return;
		}

		newNode.next = head;
		head.prev = newNode;
		head = newNode;

	}

	private void insertToInTail(int data) {

		doublyNode<Integer> newNode = new doublyNode(data);
		if (head == null) {
			head = newNode;
			return;
		}

		doublyNode<Integer> temp = head;

		while (temp.next != null) {

			temp = temp.next;
		}

		temp.next = newNode;
		newNode.prev = temp;

	}

	private void printData() {
		doublyNode<Integer> temp = head;

		while (temp != null) {
			System.out.println(temp.data);
			temp = temp.next;
		}

	}

	public static void main(String[] args) {

		doublyInsertInToTail list = new doublyInsertInToTail();
		list.insertInToHeadDoubly(10);
		list.insertInToHeadDoubly(20);
		list.insertInToHeadDoubly(30);
		list.insertInToHeadDoubly(40);
		list.printData();
		System.out.println("add in to delete");
		list.insertToInTail(70);
		list.printData();

	}

}
