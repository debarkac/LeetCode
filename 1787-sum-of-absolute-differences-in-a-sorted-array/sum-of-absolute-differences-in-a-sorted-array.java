class Solution {
    public int[] getSumAbsoluteDifferences(int[] nums) {
        int res[]=new int[nums.length];
        int left_sum=0;
        int right_sum=0;

        int total_sum=0;
        for(int i=0;i<nums.length;i++){
            total_sum=total_sum+nums[i];
        }

        for(int i=0;i<nums.length;i++){
            right_sum=total_sum-nums[i]-left_sum;//5
            int left_size=i;//1
            int right_size=nums.length-i-1;//1

            res[i]=(left_size*nums[i]-left_sum)+(right_sum-right_size*nums[i]);
            left_sum=left_sum+nums[i];
        }
        return res;
    }
}