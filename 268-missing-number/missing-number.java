class Solution {
    public int missingNumber(int[] nums) {
        // int len=nums.length;
        // if(len==1)
        //     return 0;
        // Arrays.sort(nums);
        // for(int i=0;i<len-1;i++){
        //     if(nums[i]+1!=nums[i+1])
        //         return nums[i]+1;
        // }
        // return len;


        int len=nums.length;
        int sum=0;
        int curr_sum=0;
        for(int i=0;i<=len;i++){
            sum=sum+i;
        }
        for(int i=0;i<len;i++){
            curr_sum=curr_sum+nums[i];
        }

        return sum-curr_sum;

    }
}