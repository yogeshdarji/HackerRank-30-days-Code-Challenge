package hackerrankTrees;

public class InsertInBST {

	Node root;
	static Node Insert(Node root,int value)
    {
    
    Node node =  new Node(value);
    
    if(root==null){
        return node;
    }
    
    Node current = root;
    Node parent = null;
    
    while(current!=null){
        
    parent = current;
    if(root.data<=value){
        current = current.right;
    }
    else{
        current = current.left;
    }
    
        }
    
    if(parent.data<=value){
        parent.right = node;
    }
    else{
        parent.left = node;
        }
       
    return root;
    }
	
/* To print Binary tree*/	
	public static void printBinaryTree(Node root, int level){
	    if(root==null)
	         return;
	    printBinaryTree(root.right, level+1);
	    if(level!=0){
	        for(int i=0;i<level-1;i++)
	            System.out.print("|\t");
	            System.out.println("|-------"+root.data);
	    }
	    else
	        System.out.println(root.data);
	    printBinaryTree(root.left, level+1);
	}    
	
	
public static void main(String args[]){
		
	InsertInBST tree = new InsertInBST();
		
		tree.root = new Node(3);
		tree.root.left = new Node(2);
		tree.root.right = new Node(5);
		tree.root.left.left = new Node(1);
		tree.root.right.left = new Node(4);
		tree.root.right.right = new Node(6);
		tree.root.right.right.right = new Node(7);
		
		tree.Insert(tree.root, 8);
		
		tree.printBinaryTree(tree.root,5);

	}

}
