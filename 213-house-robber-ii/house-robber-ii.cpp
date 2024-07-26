class Solution {
public:
    int rob(vector<int>& nums) {
        if(nums.size()==1)
            return nums[0];
        vector<int> temp1,temp2;
        for(int i=0;i<nums.size();i++){
            if(i!=0)
                temp1.push_back(nums[i]);
            if(i!=nums.size()-1)
                temp2.push_back(nums[i]);
        }
        int n=temp1.size();
        vector<int> dp1(n,0);
        dp1[0]=temp1[0];
        for(int i=1;i<n;i++){
            int pick=temp1[i];
            if(i>1)
                pick=pick+dp1[i-2];
            int notpick=0+dp1[i-1];
            dp1[i]=max(pick,notpick);
        }
        n=temp2.size();
        vector<int> dp2(n,0);
        dp2[0]=temp2[0];
        for(int i=1;i<n;i++){
            int pick=temp2[i];
            if(i>1)
                pick=pick+dp2[i-2];
            int notpick=0+dp2[i-1];
            dp2[i]=max(pick,notpick);
        }
        return max(dp1[n-1],dp2[n-1]);
    }
};