package recursion;

import java.util.Scanner;

public class NumberOfPathsInMatrix {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while(t-->0) {
			int m = sc.nextInt();
			int n = sc.nextInt();
			System.out.println(pathCount(m-1, n-1));
		}
		sc.close();
	}
	
	static int pathCount(int m, int n) {
		if(m==0 && n==0) {
			return 0;
		}
		if(m==0 || n==0) {
			return 1;
		}
		return pathCount(m-1, n) + pathCount(m, n-1);
	}

}
