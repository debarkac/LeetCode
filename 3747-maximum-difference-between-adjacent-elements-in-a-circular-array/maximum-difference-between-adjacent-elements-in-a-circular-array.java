class Solution {
    public int maxAdjacentDistance(int[] nums) {
        int maxi=Integer.MIN_VALUE;
        for(int i=0;i<nums.length;i++){
            int a=0;
            if(i==nums.length-1)
                a=Math.abs(nums[i]-nums[0]);
            else
                a=Math.abs(nums[i]-nums[i+1]);
            maxi=Math.max(maxi,a);
        }
        return maxi;
    }
}