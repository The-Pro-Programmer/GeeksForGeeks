package dataStructures.queue;

import java.util.Stack;

public class QueueUsingTwoStacks {

	public static void main(String[] args) {
		String str = "1 78 2 2 2 1 93 2 2 1 28 1 60 2 1 41 1 73 1 12 1 68 2 1 31 1 24 2 2 2 1 23 1 70 2 2 1 12 1 30 2 2 2 1 38 1 25 2 1 14 1 92 1 57 2 1 71 1 82 2 2 1 28 1 6 1 30 2 2 1 96 1 46 1 68 1 65 2 1 88 1 77 1 89";
		String[] ops = str.split(" ");
		QueueUsingTwoStacks test = new QueueUsingTwoStacks();
		for(int i=0; i<ops.length; i++) {
			String op = ops[i];
			if("1".equals(op)) {
				i++;
				Integer vl = Integer.parseInt(ops[i]) ;
				test.Push(vl);
				//System.out.println("Pushed: " + vl);
			}else {
				System.out.println("Popped: " + test.Pop());
			}
		}

	}

	Stack<Integer> s1 = new Stack<Integer>();
	Stack<Integer> s2 = new Stack<Integer>();

	// Function to push an element in queue by using 2 stacks.
	void Push(int x){
	   s1.push(x);
    }

	// Function to pop an element from queue by using 2 stacks.
	int Pop() {
		if(s1.isEmpty()) {
			return -1;
		}else {
			int ret = -1;
			if(s1.size()==1) {
				ret = s1.pop();
			}else {
				while(s1.size()>1) {
					s2.push(s1.pop());
				}
				ret = s1.pop();
				while(!s2.isEmpty()) {
					s1.push(s2.pop());
				}
			}
			return ret;
		}
	}

}
