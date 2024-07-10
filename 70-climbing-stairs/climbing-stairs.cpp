class Solution {
public:
    int climbStairs(int n) {
        vector<int> dp(n+1,-1);
        dp[0]=1;
        dp[1]=1;
        int i=0;
        for(i=2;i<=n;i++){
            dp[i]=dp[i-1]+dp[i-2];
        }
        return dp[i-1];
    }
};