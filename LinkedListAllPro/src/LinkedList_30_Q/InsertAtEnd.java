package LinkedList_30_Q;


//Q... Insert a node at the end
public class InsertAtEnd {

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

	public void insertAtEnd(int data) {

		nodeLinks<Integer> newNodeData = new nodeLinks<Integer>(data);
		nodeLinks<Integer> temp = head;

		if (head == null) {
			head = newNodeData;
			return;
		}
		while (temp.next != null) {
			temp = temp.next;
		}
		temp.next = newNodeData;
	}

	public void printList() {
		nodeLinks<Integer> temp = head;
		while (temp != null) {
			System.out.println(temp.data);
			temp = temp.next;
		}

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		InsertAtEnd obj1 = new InsertAtEnd();
		obj1.createAndPrint(10);
		obj1.createAndPrint(20);
		obj1.createAndPrint(30);
		obj1.printList();
		System.out.println("befor end add.....");

		obj1.insertAtEnd(80);
		obj1.printList();

	}

}
