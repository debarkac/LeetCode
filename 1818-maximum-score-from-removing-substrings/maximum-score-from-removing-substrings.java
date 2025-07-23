class Solution {
    public int maximumGain(String s, int x, int y) {
        char characters[]=s.toCharArray();
        int total=0,a=0,b=0;
        char first=x>y?'a':'b';
        char second=x>y?'b':'a';
        int maxi=Math.max(x,y);
        int mini=Math.min(x,y);

        for(char ch:characters){
            if(ch==first)
                a++;
            else if(ch==second){
                if(a>0){
                    a--;
                    total=total+maxi;
                }
                else
                    b++;
            }
            else{
                total=total+Math.min(a,b)*mini;
                a=b=0;
            }
        }
        return total+Math.min(a,b)*mini;
    }
}