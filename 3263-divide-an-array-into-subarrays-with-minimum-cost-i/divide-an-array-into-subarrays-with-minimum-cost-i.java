class Solution {
    public int minimumCost(int[] nums) {
        int sum=nums[0];
        int min=Integer.MAX_VALUE;
        int second_min=Integer.MAX_VALUE;
        for(int i=1;i<nums.length;i++){
            if(nums[i]<min){
                second_min=min;
                min=nums[i];
            }
            else if(nums[i]<second_min && nums[i]!=min){
                second_min=nums[i];
            }
            else if(nums[i]<second_min && nums[i]==min){
                second_min=nums[i];
            }
        }
        sum=sum+min+second_min;
        return sum;
    }
}