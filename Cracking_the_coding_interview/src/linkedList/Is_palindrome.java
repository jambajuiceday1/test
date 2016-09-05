package linkedList;

import java.awt.DisplayMode;

import com.internet.brands.Reverse_list;

public class Is_palindrome {

	public void display(Node head) {
		Node n = head;
		while (n != null) {
			System.out.print("--> " + n.data);
			n = n.next;
		}
	}

	public static void main(String args[]) {
		Node firstList = new Node(0);
		firstList.next = new Node(1);
		firstList.next.next = new Node(1);
		firstList.next.next.next = new Node(9);
		Is_palindrome rm = new Is_palindrome();
		// Node r = reverseList(firstList);
		// rm.display(r);
		System.out.println(ispalindrome(firstList));

	}

	private static Node reverseList(Node head) {

		if (head == null || head.next == null)
			return head;

		Node p1 = head;
		Node p2 = p1.next;

		head.next = null;
		while (p1 != null && p2 != null) {
			Node t = p2.next;
			p2.next = p1;
			p1 = p2;
			p2 = t;
		}

		return p1;
	}

	private static String ispalindrome(Node firstList) {

		Node savedList = firstList;
		Node secondList = ReverseList(firstList);
		Is_palindrome rm = new Is_palindrome();
		
		System.out.println("first");
		rm.display(savedList);
		System.out.println("\n\nSecond\n\n");
		rm.display(secondList);
		while (savedList!=null && secondList!=null) {
			if(savedList.data != secondList.data)
			{
				return "Not Equal";
			}
			savedList = savedList.next;
			secondList = secondList.next;
		}
		return "Is equal";

	}

	private static Node ReverseList(Node head) {

		if (head == null && head.next == null) {
			return head;
		}

		Node p1 = head;
		Node p2 = p1.next;

		head.next = null;
		while (p1 != null && p2 != null) {
			Node temp = p2.next;
			p2.next = p1;
			p1 = p2;
			p2 = temp;
		}
		return p1;
	}

}
