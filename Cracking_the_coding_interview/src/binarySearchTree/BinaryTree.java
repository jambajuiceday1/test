package binarySearchTree;

public class BinaryTree {

	static Node root;

	private static void addNode(int x) {

		Node newNode = new Node(x);

		if (root == null) {
			root = newNode;

		} else {

			Node focusNode = root;
			Node Parent;

			while (true) {

				Parent = focusNode;

				if (x < focusNode.key) {

					focusNode = focusNode.leftChild;
					if (focusNode == null) {
						Parent.leftChild = newNode;
						return;
					}

				} else {
					focusNode = focusNode.rightChild;
					if (focusNode == null) {
						Parent.rightChild = newNode;
						return;
					}

				}
			}
		}
	}

	public static void main(String[] args) {

		BinaryTree bn = new BinaryTree();
		bn.addNode(50);
		bn.addNode(25);
		bn.addNode(15);
		bn.addNode(30);
		bn.addNode(75);
		bn.addNode(70);
		bn.addNode(85);

		bn.inOrderTraversal(bn.root);
		System.out.println("\n");
		bn.preOrderTraversal(bn.root);
		System.out.println();
		bn.postOrderTraversal(bn.root);

	}

	private void inOrderTraversal(Node focusNode) {

		if (focusNode != null) {
			inOrderTraversal(focusNode.leftChild);
			System.out.println(focusNode);
			inOrderTraversal(focusNode.rightChild);

		}
	}

	private void preOrderTraversal(Node focusNode) {

		if (focusNode != null) {

			System.out.println(focusNode);
			preOrderTraversal(focusNode.leftChild);
			preOrderTraversal(focusNode.rightChild);

		}
	}

	private void postOrderTraversal(Node focusNode) {

		if (focusNode != null) {

			postOrderTraversal(focusNode.leftChild);
			postOrderTraversal(focusNode.rightChild);

			System.out.println(focusNode);

		}
	}

	private Node searchNode(int key) {

		Node focusNode = root;

		while (focusNode.key != key) {

			if (key < focusNode.key) {
				focusNode = focusNode.leftChild ;
			}else{
				focusNode = focusNode.rightChild;
			}
		}
		
		if(focusNode == null)
			return focusNode;
		
		return focusNode;
	}
}
