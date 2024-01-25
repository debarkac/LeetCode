class Solution {
public:
    int strStr(string haystack, string needle) {
        for(int i=0;i<haystack.length();i++){
            int a=i;
            for(int j=0;j<needle.length();j++){
                if(needle[j]==haystack[a])
                    a++;
                else{
                    a=-1;
                    break;
                }
            }
            if(a!=-1)
                return i;
        }
        return -1;
    }
};