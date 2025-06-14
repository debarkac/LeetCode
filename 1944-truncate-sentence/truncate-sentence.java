class Solution {
    public String truncateSentence(String s, int k) {
        s=s+" ";
        int len=0,index=0;
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)==' ')
                len++;
            if(len==k){
                index=i;
                break;
            }
        }
        return s.substring(0,index);
    }
}