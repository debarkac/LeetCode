class Solution {
public:
    int secondHighest(string s) {
        vector<int> a;
        int l=s.length();
        for(int i=0;i<l;i++){
            if((int)s[i]>=48 && (int)s[i]<=57){
                char c=s[i];
                int h=(int)c-48;
                a.push_back(h);
            }
        }
        if(a.size()==1)
            return -1;
        sort(a.begin(),a.end());
        int i=a.size()-1;
        while(i>0){
            if(a[i]!=a[i-1])
                return a[i-1];
            i--;
        }
        return -1;
    }
};