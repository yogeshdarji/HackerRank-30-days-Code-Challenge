package Hackerrank;


class Node{
	int data;
	Node left, right;
	
	Node(int item){
		data = item;
		left = null;
		right = null;
	}
}

public class HeightBinaryTree {

	Node root;

	int maxHeight(Node root){

		if(root==null){
			return -1;
		}
		
		
		else{
			
		int leftHeight = maxHeight(root.left);
		 int rightHeight = maxHeight(root.right);
		 
		if(leftHeight>rightHeight)
			return (leftHeight+1);
		
		else
			return (rightHeight+1);

		}
		
	}
	
	public static void main(String args[]){
		
		HeightBinaryTree tree = new HeightBinaryTree();
		
		tree.root = new Node(3);
		tree.root.left = new Node(2);
		tree.root.right = new Node(5);
		tree.root.left.left = new Node(1);
		tree.root.right.left = new Node(4);
		tree.root.right.right = new Node(6);
		tree.root.right.right.right = new Node(7);
		
		System.out.println("Height of BST="+tree.maxHeight(tree.root));

	}
}
