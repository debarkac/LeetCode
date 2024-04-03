class Solution {
public:
    int solve(string &s,string &t,int x,int y,vector<vector<int>> &dp){
        if(y==t.size())
            return 1;
            if(x==s.size())
                return 0;
            if(dp[x][y]!=-1)
                return dp[x][y];
        int answer=0;
        if(s[x]==t[y])
            answer += solve(s,t,x+1,y+1,dp);
            answer += solve(s,t,x+1,y,dp);
            return dp[x][y]= answer;
        
    }
    
    int numDistinct(string s, string t) {
        vector<vector<int>> dp(s.size()+1,vector<int>(t.size()+1,-1));
        return solve(s,t,0,0,dp);
    }
};