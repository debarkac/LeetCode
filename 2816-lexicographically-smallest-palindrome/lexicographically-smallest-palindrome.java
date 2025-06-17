class Solution {
    public String makeSmallestPalindrome(String s) {
        StringBuilder sb=new StringBuilder();
        for(int i=0;i<s.length();i++){
            sb.append(Character.toString(Math.min(s.charAt(i),s.charAt(s.length()-1-i))));
        }
        String res=sb.toString();
        return res;
    }
}