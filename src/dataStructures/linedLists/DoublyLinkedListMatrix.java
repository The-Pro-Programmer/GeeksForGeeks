package dataStructures.linedLists;

public class DoublyLinkedListMatrix {

	public static void main(String[] args) {
		int n = 3;
		int arr[][] = { { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9 } };
		construct(arr, n);
	}

	static Node construct(int arr[][], int n) {
		int num = arr[0][0];
		Node root = new Node(num);
		Node head = root;

		CustomQueue q = new CustomQueue(n * n);
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				num = arr[i][j];
				Node node = new Node(num);
				if (i == 0) {
					if (j == 0) {
						root = node;
						head = root;
						q.enque(node);
					} else {
						head.right = node;
						head = node;
						q.enque(node);
					}
				}else {
					Node top = q.deque();
					top.down = node;
					if(j==0) {
						head = node;;
					}else{
						head.right = node;
						head = node;
					}
					q.enque(node);
				}
			}
		}
		return root;
	}

	static class Node {
		int data;
		Node right, down;

		Node(int data) {
			this.data = data;
			right = null;
			down = null;
		}
	}
}
