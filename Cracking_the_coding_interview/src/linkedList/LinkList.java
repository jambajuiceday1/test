package linkedList;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class LinkList {

	Node firstLink;

	public LinkList() {
		firstLink = null;
	}

	public void RemoveDuplicates() {

		Set<Integer> set = new HashSet<Integer>();
		Node previousLink = firstLink;
		Node CurrentLink = firstLink;
		while (CurrentLink != null) {
			if (set.contains(CurrentLink.data)) {
				previousLink.next = CurrentLink.next;
				CurrentLink = CurrentLink.next;

			} else {
				set.add(CurrentLink.data);
				previousLink = CurrentLink;
				CurrentLink = CurrentLink.next;

			}
		}

	}

	public void display(Node head) {

		System.out.println("in display");
		Node n =  head;
		while (n != null) {
			System.out.println(n.data);
			n = n.next;
		}
		
	}

	public void insert(int i) {

		Node link = new Node(i);
		link.next = firstLink;
		firstLink = link;
	}

	public void insertAtLast(int i) {
		// TODO Auto-generated method stub
		Node currentLink;
		Node previousLink;
		System.out.println("here");
		Node newLink = new Node();
		newLink.data = i;
		if (firstLink == null) {
			newLink.next = firstLink;
			firstLink = newLink;
		} else {
			currentLink = firstLink;
			previousLink = firstLink;

			while (currentLink != null) {
				previousLink = currentLink;
				currentLink = currentLink.next;
			}
			previousLink.next = newLink;
			previousLink.next.next = null;
		}

	}

	public void addAtSpecificLocation(int data, int position) {
		/*
		 * 
		 * Node newNode = new Node(); newNode.i = data; Node currentNode =
		 * firstLink; Node previosNode = firstLink; int count = 0; boolean flag
		 * = false;
		 * 
		 * while (currentNode != null) { if (count == 0) { newNode.next =
		 * firstLink; firstLink = newNode;
		 * 
		 * System.out.println("0th position");
		 * 
		 * } else if (count == position) { previosNode.next = newNode;
		 * newNode.next = currentNode; System.out.println("position"); flag =
		 * true;
		 * 
		 * }
		 * 
		 * 
		 * previosNode = currentNode; currentNode = currentNode.next;
		 * 
		 * //System.out.println("update"+currentNode.next.i);
		 * 
		 * 
		 * count++; }
		 * 
		 */}

	public Node find(int i) {

		Node newNode = new Node();

		while (firstLink != null) {
			if (firstLink.data == i) {
				return firstLink;
			}

			firstLink = firstLink.next;
		}

		return null;
	}

	public boolean deleteMidleNode(Node findNode) {

		if (findNode == null || findNode.next == null) {
				return false;
		}
		
		Node curr = findNode;
		curr.data = curr.next.data;
		curr.next = curr.next.next;
		
		return true;

	}

}
