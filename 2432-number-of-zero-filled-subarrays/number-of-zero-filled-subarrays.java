class Solution {
    public long zeroFilledSubarray(int[] nums) {
        long count=0;
        long range=0;

        for(int i=0;i<nums.length;i++){
            if(nums[i]==0)
                range=range+1;
            else
                range=0;
            count=count+range;
        }
        return count;
    }
}