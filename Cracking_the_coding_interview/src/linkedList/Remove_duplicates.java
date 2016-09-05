package linkedList;

public class Remove_duplicates {

	public static void main(String[] args) {

		LinkList list = new LinkList();
		list.insert(1);
		list.insert(2);
		list.insert(3);
		list.insert(4);
		list.insert(5); // insert at first position
		
		//list.display();
		Node head = list.find(5);
		
		// list.RemoveDuplicates();
		// list.addAtSpecificLocation(10,2); //not working
		Node findNode = list.find(4); // find node by value
		
		// delete a middle node if you have access to only middle node,no access to head of link
		list.deleteMidleNode(findNode); 
		list.display(head);

		

	}

}
