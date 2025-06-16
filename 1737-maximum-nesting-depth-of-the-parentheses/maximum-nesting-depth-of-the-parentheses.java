class Solution {
    public int maxDepth(String s) {
        int par=0;
        int maxi=Integer.MIN_VALUE;
        for(int i=0;i<s.length();i++){
            char c=s.charAt(i);

            if(c=='(')
                par++;
            else if(c==')')
                par--;

            maxi=Math.max(maxi,par);
        }
        return maxi;
    }
}