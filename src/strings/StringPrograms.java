package strings;

import java.util.Scanner;

public class StringPrograms {

	public static void main(String[] args) {
		/*Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while(t>0) {
			String str = sc.next();
			reverseWordsDot(str);
			System.out.println();
			t--;
		}
		
		sc.close();*/
		
		reverseWordsDot("world.hello");
		System.out.println();
		reverseWordsDot("faith.keep");

	}

	//Reverse words in a string where word separator is '.'
	static void reverseWordsDot(String str) {
		String[] arr = str.split("\\.");
		int len = arr.length;
		for(int i=len-1; i>=0; i--) {
			System.out.print(arr[i]);
			if(i>0) {
				System.out.print(".");
			}
		}
	}
	
	
}
