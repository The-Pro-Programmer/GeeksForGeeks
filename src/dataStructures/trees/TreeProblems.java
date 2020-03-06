package dataStructures.trees;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class TreeProblems {

	
	// Count Leaves in Binary Tree - Iterative
	int countLeavesIterative(Node node) {
    	if(node==null) {
    		return 0;
    	}
    	Queue<Node> queue = new LinkedList<>();
    	queue.add(node);
    	int count = 0;
    	while(!queue.isEmpty()) {
    		Node temp = queue.poll();
    		if(temp!=null) {
    			if(temp.left==null && temp.right==null) {
    				count++;
    			}else {
    				if(temp.left!=null) {
    					queue.add(temp.left);
    				}
    				if(temp.right!=null) {
    					queue.add(temp.right);
    				}
    			}
    		}
    	}
    	return count;
    }
	
	// Count Leaves in Binary Tree - Recursive
	int countLeavesRecursive(Node node) {
    	if(node==null){
    		return 0;
    	} 
    	if(node.left==null && node.right==null){
    		return 1;
        }
        return countLeavesRecursive(node.left) + countLeavesRecursive(node.right);
    }
	
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

	
	//Height of Binary Tree
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