package LinkedList;

public class basic_operation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Node node = new Node(1);
		node.next = new Node(2);
		node.next.next = new Node(3);
		node.next.next.next = new Node(3);
		node.next.next.next.next = new Node(4);

		display(node);
		System.out.println("----------- Remove All Node's with value 3 --------");
		Node head = remove(node, 3);
		System.out.println();
		display(head);

		System.out.println("-----------  Add new Node 10 --------");
		Node newNode = new Node(10);
		Node head2 = insertNode(node, newNode);
		display(head2);

		System.out.println("-----------  Add new Node 10 at location 3 --------");
		Node newNode2 = new Node(11);
		Node head4 = insertNodeAt(head2, newNode2, 3);
		display(head4);
		
		System.out.println("---------Find Interseacrion of linked list-----");
	}

	private static Node insertNodeAt(Node node, Node newNode2, int position) {

		if (node == null)
			return null;
		if (newNode2 == null)
			return node;

		if (position == 0) {
			newNode2.next = node;
			return newNode2;
		}

		
		Node preNode = node;
		Node currNode = node.next;
		int count = 1;
		
		while (currNode != null) {
			
			if (count == position) {
				preNode.next = newNode2;
				newNode2.next = currNode;
				return node;
			}
			preNode = preNode.next;
			currNode = currNode.next;
			count++;
		}

		return node;
	}

	private static Node insertNode(Node node, Node newNode) {

		if (node == null)
			return null;
		if (newNode == null)
			return node;

		newNode.next = node;

		return newNode;
	}

	private static Node remove(Node node, int value) {

		if (node == null)
			return null;

		Node dummy = new Node(0);
		Node temp = dummy;
		dummy.next = node;
		Node currNode = node;

		while (currNode != null) {

			if (currNode.value == value) {
				dummy.next = currNode.next;
				currNode = currNode.next;

			} else {
				dummy = dummy.next;
				currNode = currNode.next;
			}
		}
		return temp.next;

	}

	private static void display(Node node) {
		// TODO Auto-generated method stub

		if (node == null) {
			return;
		}

		while (node != null) {
			System.out.print(" " + node.value);
			node = node.next;
		}
		System.out.println();

	}
	
	

}
