package strings;

import java.util.ArrayList;

public class GenerateBinaryNumbers {

	//Given a number N. The task is to generate and print all binary numbers with decimal values from 1 to N.
	
	public static void main(String[] args) {
		
		System.out.println(generate(2));
		System.out.println(generate(5));

	}

	//Function to generate binary numbers from 1 to N using a queue.
    static ArrayList<String> generate(int N){
        ArrayList<String> result = new ArrayList<String>();
        for(int i=1; i<=N; i++) {
        	result.add(Integer.toBinaryString(i));
        }
        return result;
    }
	
}
