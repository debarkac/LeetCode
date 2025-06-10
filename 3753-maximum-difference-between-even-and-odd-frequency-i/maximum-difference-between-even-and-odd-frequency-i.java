class Solution {
    public int maxDifference(String s) {
        int maxi_odd=0;
        int min_even=Integer.MAX_VALUE;
        for(int i=0;i<s.length();i++){
            char c=s.charAt(i);
            int count=0;
            for(int j=0;j<s.length();j++){
                if(c==s.charAt(j)){
                    count++;
                }
            }
            if(count%2==0 && count<min_even){
                min_even=count;
            }
            else if(count%2!=0 && count>maxi_odd){
                maxi_odd=count;
            }
        }
        return maxi_odd-min_even;
    }
}