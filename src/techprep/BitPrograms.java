package techprep;

public class BitPrograms {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		long num = 10000000000000041l;
		count(num);
	}
	
	static public void count(long num){
        int zeros = 0, ones = 0;
        while(num>1){
	        long rem = num%2;
	        if(rem==0)	zeros++;
	        if(rem==1)	ones++;
	        num = num/2;
        }
        ones++;
        System.out.println(ones + " " + zeros);
    }

}
