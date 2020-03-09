package dataStructures.linedLists;

public class CustomQueue {

	int capacity ;
	DoublyLinkedListMatrix.Node[] q ;
	int front, rear, count;
	
	public CustomQueue(int capacity) {
		super();
		this.capacity = capacity;
		front = 0;
		rear = -1;
		count = 0;
		q = new DoublyLinkedListMatrix.Node[capacity];
	}
	
	public void enque(DoublyLinkedListMatrix.Node node) {
		rear = (rear+1)%capacity;
		q[rear] = node;
		count++;
	}
	
	public DoublyLinkedListMatrix.Node deque() {
		DoublyLinkedListMatrix.Node temp = q[front];
		front = (front+1)%capacity;
		count--;
		return temp;
	}
	
	

}
