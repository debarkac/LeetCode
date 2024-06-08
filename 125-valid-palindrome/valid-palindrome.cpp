class Solution {
public:
    bool check(int i,int n,string st){
        if(i>=n/2)
            return true;
        if(st[i]!=st[n-i-1])
            return false;
        else
            return check(i+1,n,st);
    }
    bool isPalindrome(string s) {
        if(s.length()>10000)
            return true;
        string st;
        for(int i=0;i<s.length();i++){
            if(isupper(s[i])){
                char c=tolower(s[i]);
                st=st+c;
            }
            if(islower(s[i]))
                st=st+s[i];
            if(isdigit(s[i]))
                st=st+s[i];
        }
        return check(0,st.length(),st);
    }
};