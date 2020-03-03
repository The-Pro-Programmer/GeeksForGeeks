package googlePreparation;

import java.util.Arrays;

public class ZeroSumTriplets {

	public static void main(String[] args) {
		int arr[] = {97, -27, 2 ,-34, 61, -39};
		System.out.println(findTriplets(arr, arr.length));
		System.out.println(findTripletsOptimized1(arr, arr.length));
	}
	
	// Function to check if triplet is present 
    // arr[]: input array
    // n: size of the array
	public static  boolean findTriplets(int arr[] , int n)
    {
        for(int i=0; i<n-2; i++){
            int n1 = arr[i];
            for(int j=i+1; j<n-1; j++) {
            	int n2 = arr[j];
            	for(int k=j+1; k<n; k++) {
            		int n3=arr[k];
            		if((n1+n2+n3) == 0) {
            			return true;
            		}
            	}
            }
        }
        
        return false;
    }

	
	public static  boolean findTripletsOptimized1(int arr[] , int n)
    {
        Arrays.sort(arr);
        for(int i=0; i<n-1; i++) {
        	int left = i+1;
        	int right= n-1;
        	int x = arr[i];
        	while(left<right) {
        		int sum = x + arr[left] + arr[right];  
        		if(sum == 0) {
        			return true;
        		}
        		if(sum<0) {
        			left++;
        		}else {
        			right--;
        		}
        	}
        }
        
        return false;
    }

	
}
