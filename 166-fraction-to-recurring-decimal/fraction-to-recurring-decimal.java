class Solution {
    public String fractionToDecimal(int numerator2, int denominator2) {
        long numerator=(long)numerator2;
        long denominator=(long)denominator2;
        if(numerator%denominator==0)
            return Long.toString(numerator/denominator);
        StringBuilder res=new StringBuilder();

        if(numerator*denominator<0)
            res.append("-");

        numerator=Math.abs(numerator);
        denominator=Math.abs(denominator);
        res.append(Long.toString(numerator/denominator));
        res.append(".");

        long remainder=numerator%denominator;
        HashMap<Long,Integer> map=new HashMap<>();
        while(remainder!=0){
            if(map.containsKey(remainder)){
                res.insert(map.get(remainder),"(");
                res.append(")");
                break;
            }

            map.put(remainder,res.length());
            remainder=remainder*10;
            res.append(Long.toString(remainder/denominator));
            remainder=remainder%denominator;
        }
        return res.toString();
    }
}