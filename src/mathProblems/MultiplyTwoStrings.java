
//Given two numbers as strings s1 and s2. Calculate their Product

    public String multiplyStrings(String s1,String s2)
    {
        try{
            BigDecimal bd1 = new BigDecimal(s1);
            BigDecimal bd2 = new BigDecimal(s2);
            String ret = String.valueOf(bd1.multiply(bd2));
            return ret;
        }catch(Exception e){
            return e.toString();
        }
    }
