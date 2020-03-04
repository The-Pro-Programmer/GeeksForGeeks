package techprep;

import java.util.HashMap;
import java.util.Map;

public class MostFrequestNumber {

	public static void main(String[] args) {
		int arr[] = {1, 2, 3, 4};
		int freq = getMostFrequentNumber(arr);
		System.out.println(freq==-2 ? "Array is null or empty" : "Most freuquent number: " + freq);
	}
	
	public static int getMostFrequentNumber(int arr[]) {
		int freq = Integer.MIN_VALUE;
		if(arr==null || arr.length==0) {
			return -2;
		}
		Map<Integer, Integer> freqMap = new HashMap<>();
		int len = arr.length;
		for(int i=0; i<len; i++) {
			if(freqMap.containsKey(arr[i])) {
				int num = freqMap.get(arr[i]);
				num++;
				if(num>freq) {
					freq = num;
				}
				freqMap.put(arr[i], num);
			}else {
				freqMap.put(arr[i], i);
			}
		}
		if(freq==Integer.MIN_VALUE) {
			return arr[0];
		}
		return freq;
	}

}
