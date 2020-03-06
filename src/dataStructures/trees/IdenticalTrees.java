package dataStructures.trees;

public class IdenticalTrees{

	boolean isIdentical(Node root1, Node root2){
    	String path1 = inorder(root1);
    	String path2 = inorder(root2);
    	return path1.equals(path2);
    }
    
    
    public String inorder(Node root){
    	if(root==null){
    		return "N";
        }
        return inorder(root.left) + root.data + inorder(root.right);
    }

}