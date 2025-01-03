class Solution {
public:
    int waysToSplitArray(vector<int>& nums) {
        long long int left=0;
        long long int right=0;
        left=nums[0];
        for(int i=1;i<nums.size();i++){
            right=right+nums[i];
        }
        int c=0;
        for(int i=1;i<nums.size();i++){
            if(left>=right)
                c++;
            left=left+nums[i];
            right=right-nums[i];
        }
        return c;
    }
};