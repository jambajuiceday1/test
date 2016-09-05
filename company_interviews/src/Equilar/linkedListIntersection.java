package Equilar;

public class linkedListIntersection {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Node first = new Node(1);
		first.next = new Node(2);
		first.next.next = new Node(3);
		first.next.next.next = new Node(4);
		first.next.next.next.next = new Node(5);

		Node second = new Node(1);
		second.next = new Node(2);
		second.next.next = first.next.next.next;

		Node newNode = displayList(first);
		System.out.println();
		Node newNode2 = reverseList(first);
		displayList(newNode2);
		
		
		//System.out.println(findIntersection(first, second));

	}

	private static Node reverseList(Node first) {
		// TODO Auto-generated method stub\
		
			if(first == null || first.next == null)
				return first;
			
			Node p1 = first;
			Node p2 = first.next;
			
			first.next = null;
			
			
			while(p1 != null && p2 != null){
				Node temp = p2.next;
				p2.next = p1;
				p1=  p2;
				p2 = temp;
			}
			
			return p1;
			
			
		
	}

	private static Node displayList(Node first) {
		// TODO Auto-generated method stub
		
		Node temp = first;
		while(first != null)
		{
			System.out.print(first.value+" --> ");
			first = first.next;
		}
		return temp;
	}

	private static int findIntersection(Node first, Node second) {
		// TODO Auto-generated method stub

		int len1 = 0;
		int len2 = 0;
		Node p1 = first;
		Node p2 = second;

		while (p1 != null) {
			len1++;
			p1 = p1.next;
		}

		while (p2 != null) {
			len2++;
			p2 = p2.next;
		}

		p1 = first;
		p2 = second;
		int diff = 0;
		if (len1 > len2) {
			diff = len1 - len2;

			while (diff > 0) {
				p1 = p1.next;
				diff--;
			}
		} else {

			diff = len2 - len1;

			while (diff > 0) {
				p2 = p2.next;
				diff--;
			}
		}
		
		while(p1 != null && p2 != null){
			if(p1.value == p2.value)
				return p1.value;
			else
			{
				p1 = p1.next;
				p2 = p2.next;
			}
		}
		return 0;
	}

}
