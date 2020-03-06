package dataStructures.trees;

public class TreeTraversals {

	
	static void preorder(Node root) {
		if(root!=null)	{
			System.out.print(root.data + " ");
			preorder(root.left);
			preorder(root.right);
		}
	}

	
	void inOrder(Node root){
		if(root!=null){
			inOrder(root.left);
			System.out.print(root.data + " ");
			inOrder(root.right);
		}
	}

	
	void postOrder(Node root) {
		if (root != null) {
			if (root.left == null && root.right == null) {
				System.out.print(root.data + " ");
			} else {
				postOrder(root.left);
				postOrder(root.right);
				System.out.print(root.data + " ");
			}
		}
	}

}
