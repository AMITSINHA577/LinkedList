package LinkedList_30_Q;

public class nodeLinks<T> {

	T data;
	nodeLinks next;

	nodeLinks() {
		this.next = null;
	}

	nodeLinks(T data) {
		this.next = null;
		this.data = data;
	}
}
