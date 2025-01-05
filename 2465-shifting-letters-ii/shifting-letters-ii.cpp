class Solution {
public:
    string shiftingLetters(string s, vector<vector<int>>& shifts) {
        // for(int i=0;i<shifts.size();i++){
        //     int start=shifts[i][0];
        //     int last=shifts[i][1];
        //     for(;start<=last;start++){
        //         char c=s[start];
        //         if(shifts[i][2]==0){
        //             if(c=='a'){
        //                 c='z';
        //                 break;
        //             }
        //             int asc=(int)c;
        //             asc=asc-1;
        //             c=(char)asc;  
        //         }
        //         else{
        //             if(c=='z'){
        //                 c='a';
        //                 break;
        //             }
        //             int asc=(int)c;
        //             asc=asc+1;
        //             c=(char)asc;
        //         }
        //         s[start]=c;
        //     }
        // }
        // return s;
        vector<int> count(s.size()+1,0);

        // for(int i=0;i<shifts.size();i++){
        //     int start=shifts[i][0];
        //     int last=shifts[i][1];
        //     for(;start<=last;start++){
        //         if(shifts[i][2]==0)
        //             count[start]--;
        //         else
        //             count[start]++;
        //     }
        // }

        for (auto& shiftOp : shifts) {
            int start = shiftOp[0], end = shiftOp[1], direction = shiftOp[2];
            count[start] += (direction == 1 ? 1 : -1);
            count[end + 1] -= (direction == 1 ? 1 : -1);
        }


        int curr=0;
        for(int i=0;i<s.size();i++){
            curr=curr+count[i];
            count[i]=curr;
        }

        for(int i=0;i<s.size();i++){
            int net=(count[i]%26+26)%26;
            s[i]='a'+(s[i]-'a'+net)%26;
        }
        // for(int i=0;i<count.size();i++){
        //     cout<<count[i];
        //     if(s[i]=='a' && count[i]<=-1)
        //         s[i]=(char)(123-count[i]);
        //     else if(s[i]=='z' && count[i]>=1)
        //         s[i]=(char)(96+count[i]);
        //     else if((int)(s[i]+count[i])<97){
        //         s[i]=(char)(124+count[i]);
        //     }
        //     else if((int)(s[i]+count[i]>122)){
        //         s[i]=(char)(94+count[i]);
        //     }
        //     else
        //     s[i]=s[i]+count[i];
        // }
        return s;
    }
};