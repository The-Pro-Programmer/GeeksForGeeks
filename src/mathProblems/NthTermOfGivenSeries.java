

//Find N-th term in the series -- 9   33   73   129   201

    static long nthOfSeries(long n){
        if(n<2){
            return 9l;
        }
        return nthOfSeries(n-1) + 24 + ((n-2)*16);
    }
