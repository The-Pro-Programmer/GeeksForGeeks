package dataStructures.trees;

import java.util.LinkedList;
import java.util.Queue;

public class TreePrograms1 {

	int countNonLeafNodes(Node root) {
		if (root == null) {
			return 0;
		}

		if (root.left == null && root.right == null) {
			return 0;
		}

		return 1 + countNonLeafNodes(root.left) + countNonLeafNodes(root.right);
	}

	static int sumBT(Node head) {
		if (head == null) {
			return 0;
		}
		return head.data + sumBT(head.left) + sumBT(head.right);
	}

	// Minumum Value in Binary Search Tree
	int minValue(Node node) {
		if (node == null) {
			return -1;
		}
		Node root = node;
		while (root.left != null) {
			root = root.left;
		}
		return root.data;
	}

	// Size of Binary Tree - Iterative
	public static int sizeIterative(Node root) {
		if (root == null) {
			return 0;
		}
		int count = 0;
		Queue<Node> queue = new LinkedList<>();
		queue.add(root);
		while (!queue.isEmpty()) {
			Node temp = queue.poll();
			if (temp != null) {
				count++;
				queue.add(temp.left);
				queue.add(temp.right);
			}
		}
		return count;
	}

	// Size of Binary Tree - Recursive
	public static int sizeRecursive(Node root) {
		if (root == null) {
			return 0;
		}
		return 1 + sizeRecursive(root.left) + sizeRecursive(root.right);
	}

	// Count Leaves in Binary Tree - Iterative
	int countLeavesIterative(Node node) {
		if (node == null) {
			return 0;
		}
		Queue<Node> queue = new LinkedList<>();
		queue.add(node);
		int count = 0;
		while (!queue.isEmpty()) {
			Node temp = queue.poll();
			if (temp != null) {
				if (temp.left == null && temp.right == null) {
					count++;
				} else {
					if (temp.left != null) {
						queue.add(temp.left);
					}
					if (temp.right != null) {
						queue.add(temp.right);
					}
				}
			}
		}
		return count;
	}

	// Count Leaves in Binary Tree - Recursive
	int countLeavesRecursive(Node node) {
		if (node == null) {
			return 0;
		}
		if (node.left == null && node.right == null) {
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

	// Height of Binary Tree
	int height(Node node) {
		if (node == null) {
			return 0;
		}
		int left = height(node.left);
		int right = height(node.right);
		int max = Integer.max(left, right);
		return max + 1;
	}

}