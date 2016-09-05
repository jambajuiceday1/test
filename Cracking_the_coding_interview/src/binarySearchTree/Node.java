package binarySearchTree;

public class Node {

	int key;
	Node leftChild;
	Node rightChild;
	
	public Node(int x){
		key = x;
	}

	@Override
	public String toString() {
		return "Node [key=" + key + "]";
	}
	
	
}
