
// Swap two numbers Without third variable

  static List<Integer> get(int a,int b){
        a = a + b;
        b = a - b;
        a = a - b;
        List<Integer> result = new ArrayList<>();
        result.add(a);
        result.add(b);
        return result;
    }
