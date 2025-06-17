class Solution {
    public String maximumOddBinaryNumber(String s) {
        int counter1=0,counter0=0;
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)=='1')
                counter1++;
            else
                counter0++;
        }

        StringBuilder sb=new StringBuilder();
        sb.append("1".repeat(counter1-1));
        sb.append("0".repeat(counter0));
        sb.append('1');

        String res=sb.toString();
        return res;
    }
}