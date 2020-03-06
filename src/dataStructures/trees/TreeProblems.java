package dataStructures.trees;

public class TreeProblems {

	boolean isIdentical(Node root1, Node root2) {
		String path1 = inorder(root1);
		String path2 = inorder(root2);
		return path1.equals(path2);
	}

	public String inorder(Node root) {
		if (root == null) {
			return "N";
		}
		return inorder(root.left) + root.data + inorder(root.right);
	}

	int height(Node node)  {
	
		if(node==null){
			return 0;
		}
	
		int left = height(node.left);
		int right = height(node.right);
		int max = Integer.max(left, right);
		return max+1;

     }

}