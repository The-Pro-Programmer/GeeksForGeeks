package dataStructures.linedLists;


public class LinkedListProgramsSet1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	public static int getCount(Node head) {
		int count = 0;
		while (head != null) {
			count++;
			head = head.next;
		}
		return count;
	}

}
