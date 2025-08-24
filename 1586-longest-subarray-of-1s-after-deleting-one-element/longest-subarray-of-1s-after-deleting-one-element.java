class Solution {
    public int longestSubarray(int[] nums) {
        int left=0,right=0;
        int count=0;
        int zeroes=0;
        while(right<nums.length){
            if(nums[right]==1)
                right++;
            else{
                zeroes++;
                right++;
            }
            
            while(zeroes>1){
                if(nums[left]==0)
                    zeroes--;
                left++;
            }

            count=Math.max(count,right-left);
        }
        count=count-1;
        return count;
    }
}