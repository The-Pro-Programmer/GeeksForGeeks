package strings;

import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;



public class StringPrograms {

	public static void main(String[] args) {
		/*Scanner sc = new Scanner(System.in); 
		int t = sc.nextInt(); 
		while(t>0) {
		    String str = sc.next();
		    String arr[] = str.split(" ");
		    boolean flag = isAnagram(arr[0], arr[1]);
		    System.out.println(flag ? "YES" : "NO");
		    t--;
		}*/
		
		
		System.out.println("geeksforgeeks : forgeeksgeeks -> " + isAnagram("geeksforgeeks", "forgeeksgeeks"));
		
		System.out.println("TAC: ACT -> " + isAnagram("TAC", "ACT"));
		System.out.println("TAC: ACT123 -> " + isAnagram("TAC", "ACT123"));
		
		reverseWordsDot("world.hello");
		System.out.println();
		reverseWordsDot("faith.keep");
		
		

	}
	
	static boolean isAnagram(String str1, String str2){
		if (str1 == null && str2 == null)
			return true;
		if (str1 == null || str2 == null)
			return false;
		if (str1.length() != str2.length())
			return false;
		
		char[] arr1 = str1.toCharArray();
		Arrays.sort(arr1);
		str1 = new String(arr1);
		char[] arr2 = str2.toCharArray();
		Arrays.sort(arr2);
		str2 = new String(arr2);
		
		if (str1.equals(str2)) {
			return true;
		}
		return false;
	}
	
	static Character[] getCharArray(String str) {
		return str.chars().mapToObj(c -> (char)c).toArray(Character[] :: new);
	}

	// Reverse words in a string where word separator is '.'
	static void reverseWordsDot(String str) {
		String[] arr = str.split("\\.");
		int len = arr.length;
		for (int i = len - 1; i >= 0; i--) {
			System.out.print(arr[i]);
			if (i > 0) {
				System.out.print(".");
			}
		}
	}


}
