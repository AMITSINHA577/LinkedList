package linkedList;

public class doublyInsertInToHead {
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

	private void printData() {
		doublyNode<Integer> temp = head;

		while (temp != null) {
			System.out.println(temp.data);
			temp = temp.next;
		}

	}

	public static void main(String[] args) {

		doublyInsertInToHead list = new doublyInsertInToHead();
		list.insertInToHeadDoubly(10);
		list.insertInToHeadDoubly(20);
		list.insertInToHeadDoubly(30);
		list.insertInToHeadDoubly(40);
		list.printData();

	}

}

class doublyNode<T> {

	T data;
	doublyNode<T> next;
	doublyNode<T> prev;

	public doublyNode() {
		this.next = null;
		this.prev = null;
	}

	public doublyNode(T data) {
		this.data = data;
		this.next = null;
		this.prev = null;
	}
}
