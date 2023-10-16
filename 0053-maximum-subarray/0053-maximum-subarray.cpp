class Solution {
public:
    int maxSubArray(vector<int>& nums) {
        // int maxi=INT_MIN;
        // int sum=0;
        // if(nums.size()==1)
        //     return nums[0];
        // for(int i=0;i<nums.size();i++){
        //     sum=sum+nums[i];
        //     if(sum<0)
        //         sum=0;
        //     if(sum>maxi)
        //         maxi=sum;
        // }
        // return maxi;


        int curMax = 0, maxTillNow = INT_MIN;
        for(int i=0;i<nums.size();i++){
            curMax = max(nums[i], curMax + nums[i]);
            maxTillNow = max(maxTillNow, curMax);
        }
        return maxTillNow;
    }
};