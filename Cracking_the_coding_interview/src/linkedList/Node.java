package linkedList;

public class Node {

	Node next;
	int data;

	public Node(){
		
	}
	public Node(int i) {

		this.data = i;
	}
	public Node setNext(Node more) {
		this.next = more;
		return this.next;
		
		
	}

}


