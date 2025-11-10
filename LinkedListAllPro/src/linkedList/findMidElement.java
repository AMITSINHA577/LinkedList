package linkedList;

public class findMidElement {

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

	public Node<Integer> midElemet() {
		Node<Integer> fast = head;
		Node<Integer> slow = head;

		while (fast != null && fast.next != null) {
			fast = fast.next.next;
			slow = slow.next;
		}

		return slow;

	}

	public void printData() {
		Node<Integer> temp = head;
		while (temp != null) {
			System.out.println(temp.data);
			temp = temp.next;
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		findMidElement obj1 = new findMidElement();
		obj1.insertInToTop(10);
		obj1.insertInToTop(20);
		obj1.insertInToTop(90);
		obj1.insertInToTop(40);
		obj1.insertInToTop(70);
		obj1.insertInToTop(170);
		obj1.printData();
		Node<Integer> mid = obj1.midElemet();
		System.out.println("this is mid element: " + mid.data);
	}

}
