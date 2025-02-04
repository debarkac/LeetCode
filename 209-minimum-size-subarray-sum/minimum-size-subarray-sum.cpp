class Solution {
public:
    int minSubArrayLen(int target, vector<int>& nums) {
        int left=0;
        int right=0;
        int sum=0;
        int min_size=INT_MAX;
        while(right<nums.size()){
            sum=sum+nums[right];
            while(sum>=target){
                min_size=min(min_size,right-left+1);
                sum=sum-nums[left];
                left++;
            }
            right++;
        }

        if(min_size==INT_MAX){
            return 0;
        }

        return min_size;
    }
};