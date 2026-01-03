package LinkedList_30_Q;

import linkedList.deleteAtAnyPositionData;

public class DeleteNodeByPosition {

	nodeLinks<Integer> head;

	public void insertData(int data) {
		nodeLinks<Integer> newNodeData = new nodeLinks<Integer>(data);

		if (head == null) {
			head = newNodeData;
			return;
		}

		newNodeData.next = head;
		head = newNodeData;
	}

	public void printData() {
		nodeLinks<Integer> temp = head;

		while (temp != null) {
			System.out.println(temp.data);
			temp = temp.next;
		}
	}

	public void deleteByPosition(int delPost) {

		nodeLinks<Integer> temp = head;
		nodeLinks<Integer> prev = null;

		if (delPost < 0) {
			System.out.println("invalid pos");
			return;
		}

		int currecntPos = 0;
		while (temp.next != null && currecntPos < delPost) {

			prev = temp;
			temp = temp.next;
			currecntPos++;
		}

		if (temp == null) {
			System.out.println("Pos is out of range");
			return;
		}

		prev.next = temp.next;

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		DeleteNodeByPosition obj1 = new DeleteNodeByPosition();
		obj1.insertData(10);
		obj1.insertData(20);
		obj1.insertData(30);
		obj1.insertData(40);
		obj1.printData();
		System.out.println("after delete from pos");
		obj1.deleteByPosition(2);
		obj1.printData();
	}

}
