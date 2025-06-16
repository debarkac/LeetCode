class Solution {
    public int maximumDifference(int[] nums) {
        int maxi=Integer.MIN_VALUE;
        for(int i=0;i<nums.length;i++){
            for(int j=i+1;j<nums.length;j++){
                maxi=Math.max(maxi,nums[j]-nums[i]);
            }
        }

        if(maxi<0 || maxi==0)
            return -1;
        return maxi;
    }
}