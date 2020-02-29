package recursion;

public class RecursionReplacingLoop {

	static int n = 10;
	
	public static void main(String[] args) {
		print1toN(1);

	}
	
	static void print1toN(int num) {
		if(num<=n) {
			System.out.print(num + " ");
			num++;
			print1toN(num);
		}
	}

}
