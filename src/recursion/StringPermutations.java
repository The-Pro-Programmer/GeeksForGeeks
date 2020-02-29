package recursion;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class StringPermutations {

static List<String> perms;
    
	public static void main (String[] args) {
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while(t>0){
		    perms = new ArrayList<>();
		    String str = sc.next();
		    str = bubbleSort(str);
		    permute(str, 0, str.length()-1);
		    Collections.sort(perms);
		    perms.stream().forEach(rec -> System.out.print(rec + " "));
		    System.out.println();
		    t--;
		}
		sc.close();
	}
	
	
	static void permute(String str, int l, int r) {
		if(l==r) {
			perms.add(str);
		}else {
			for(int i=l; i<=r; i++) {
				str = swap(str, l, i);
				permute(str, l+1, r);
				str = swap(str, l, i);
			}
		}
	}
	
	public static String bubbleSort(String str) {
		char[] arr = str.toCharArray();
		int len = str.length();
		for(int i=0; i<len-1; i++) {
			for(int j=i+1; j<len; j++) {
				if(arr[i]>arr[j]) {
					char ch = arr[i];
					arr[i] = arr[j];
					arr[j] = ch;
				}
			}
		}
		return new String(arr);
	}
	
	public static String swap(String str, int i, int j) {
		char[] arr = str.toCharArray();
		char ch = arr[i];
		arr[i] = arr[j];
		arr[j] = ch;
		return new String(arr);
	}
	

}
