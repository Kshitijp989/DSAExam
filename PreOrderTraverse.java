package BinaryTree;



public class PreOrderTraverse {
       Node root;
      static public class Node{
    	   int key;
    	   Node left,right;
    	   public Node(int key) {
   			this.key=key;	
   		}
   		@Override
   		public String toString() {
   			return "Node [key=" + key + "]";
   		}
   		
       }
       public void preOrder(Node root) {
   		if (root==null) {
   			return;
   		}
   		System.out.print(" "+root.key);
   		preOrder(root.left);
   		
   		preOrder(root.right);
   		
   	}
       public static void main(String[] args) {
    	   PreOrderTraverse pr=new PreOrderTraverse();
    	    pr.root=new Node(6);
    	    pr.root.left=new Node(4);
    	    pr.root.left.left=new Node(3);
    	    pr.root.left.right=new Node(5);
    	    pr.root.right=new Node(8);
    	    pr.root.right.left=new Node(7);
    	    pr.root.right.right=new Node(9);
    	   
    	    System.out.println("\nPreOrder");
    	    pr.preOrder(pr.root);
       }
    	    
}
