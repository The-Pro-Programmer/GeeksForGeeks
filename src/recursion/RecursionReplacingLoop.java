package recursion;

import java.util.Scanner;

public class RecursionReplacingLoop {

	/* Prints numbers from 1 to n */
    static void printNos(int n)
    {
       if(n > 0) 
       {
           printNos(n-1);
           System.out.print(n + " ");
       }
    }
    
    /* Driver program to test printNos */
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        
        for(; t>0; t--)
        {
            int n = sc.nextInt();
            printNos(n);
            System.out.println();
        }
        
        sc.close();
    }

}
