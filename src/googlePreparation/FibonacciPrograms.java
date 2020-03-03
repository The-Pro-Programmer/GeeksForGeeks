package googlePreparation;

import java.math.BigInteger;
import java.util.Scanner;

public class FibonacciPrograms {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while(t>0){
		    int len = sc.nextInt();
		    for(int i=0; i<len; i++){
		    	int n = sc.nextInt(); 
		        BigInteger num = new BigInteger(""+n);
		        boolean flag = isFibonacci(num);
		        if(flag){
		            System.out.print(num + " ");
		        }
		    }
		    System.out.println();
		    t--;
		}
		sc.close();
	}
	
	static boolean isFibonacci(BigInteger num){
	    Double res1 = Math.sqrt((5 * Math.pow(num.doubleValue(), 2)) + 4);
	    Double res2 = Math.sqrt((5 * Math.pow(num.doubleValue(), 2)) - 4);
	    boolean flag1 = (res1 - Math.floor(res1) ==0);
	    boolean flag2 = (res2 - Math.floor(res2) ==0);
	    return flag1 || flag2;
	}
	
	//Given a positive integer N, print the Fibonacci series till the number N. 
	//If N is a part of the series, print N as well.
	static void printNFiboNums(BigInteger n){
	    BigInteger prev = new BigInteger("0");
	    BigInteger next = new BigInteger("1");
	    BigInteger sum = new BigInteger("0");
	    if(n.equals(new BigInteger("1"))) {
	    	System.out.print("0 1 1");
	    }else {
	    	System.out.print("0 1");
	    	while(true) {
	    		sum = prev.add(next);
	    		prev = next;
	    		next = sum;
	    		if(sum.compareTo(n)<=0){
	    		    System.out.print(" " + sum);
	    		}else{
	    		    break;
	    		}
	    	}
	    }
	}
	
	//Given a positive integer N, find the Nth fibonacci number. 
	//Since the answer can be very large, print the answer modulo 1000000007.
	static BigInteger getNthFiboChar(int num){
	    BigInteger sum = new BigInteger("0");
	    BigInteger prev = new BigInteger("0");
	    BigInteger next = new BigInteger("1");
	    int count = 2;
	    while(count<=num){
	        sum = prev.add(next);
	        prev = next;
	        next = sum;
	        count++;
	    }
	    BigInteger ret = sum;
	    ret = ret.mod(new BigInteger("1000000007"));
	    return ret;
	}

}
