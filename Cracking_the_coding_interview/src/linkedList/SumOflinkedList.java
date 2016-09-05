package linkedList;

public class SumOflinkedList {

	public void display(Node head) {
		Node n = head;
		while (n != null) {
			System.out.print("--> " + n.data);
			n = n.next;
		}
	}

	public static void main(String args[]) {
		Node firstList = new Node(7);
		firstList.next = new Node(1);
		firstList.next.next = new Node(6);

		Node secondList = new Node(5);
		secondList.next = new Node(9);
		secondList.next.next = new Node(2);

		SumOflinkedList rm = new SumOflinkedList();

		rm.display(firstList);
		System.out.println();
		rm.display(secondList);
		System.out.println();
		Node Res = rm.calculateSum(firstList, secondList, 0);

		System.out.println("SUM IS");
		rm.display(Res);

	}

	public Node calculateSum(Node firstList, Node secondList, int carry) {

		int sum = 0;
		if (firstList == null && secondList == null)
			return null;

		Node NewList = new Node();
		int value = 0;

		if (firstList != null) {
			value += firstList.data+carry;
		}

		if (secondList != null) {
			value += secondList.data;
		}
		//System.out.println(value);
		NewList.data = (value) % 10;
		carry = (value) / 10;
		sum += NewList.data;

		System.out.println("new list data"+NewList.data);
		if (firstList != null && secondList != null) {
			
			Node more =
			calculateSum(firstList.next, secondList.next, carry);
			NewList = NewList.setNext(more);
		}
		
		
		return NewList;
		
		
		

	}
}