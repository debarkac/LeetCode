class Solution {
    public String makeFancyString(String s) {
        StringBuilder res=new StringBuilder();
        char last=s.charAt(0);
        res.append(last);
        int c=1;
        for(int i=1;i<s.length();i++){
            char ch=s.charAt(i);
            if(ch==last){
                c++;
                if(c<3)
                    res.append(ch);
            }
            else{
                last=ch;
                c=1;
                res.append(ch);
            }
        }
        return res.toString();
    }
}