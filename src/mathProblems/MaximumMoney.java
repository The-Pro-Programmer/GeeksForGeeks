    static int maximizeMoney(int N , int K) {
        int houses = N%2==0 ? N/2 : (N/2)+1;
        return houses*K;
    }
