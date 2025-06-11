class Solution {
    public String addBinary(String a, String b) {
        if(a.length()<b.length()){
            String duplicate=a;
            a=b;
            b=duplicate;
        }
        while(b.length()<a.length())
            b='0'+b;
        int curry=0;
        String res="";
        for(int i=b.length()-1;i>=0;i--){
            if(a.charAt(i)=='1' && b.charAt(i)=='1'){
                if(curry==0){
                    res='0'+res;
                    curry=1;
                }
                else{
                    res='1'+res;
                }
            }
            else if(a.charAt(i)=='0' && b.charAt(i)=='0'){
                if(curry==0){
                    res='0'+res;
                }
                else{
                    res='1'+res;
                    curry=0;
                }
            }
            else{
                if(curry==0){
                    res='1'+res;
                }
                else{
                    res='0'+res;
                }
            }
        }
        if(curry==1)
            res='1'+res;
        return res;
    }
}