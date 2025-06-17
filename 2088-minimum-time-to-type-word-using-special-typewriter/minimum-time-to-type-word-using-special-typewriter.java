class Solution {
    public int minTimeToType(String word) {
        int s=0;
        char c='a';
        for(char ch:word.toCharArray()){
            int time=Math.min(Math.abs(c-ch),26-Math.abs(c-ch));
            s=s+time+1;
            c=ch;
        }
        return s;
    }
}