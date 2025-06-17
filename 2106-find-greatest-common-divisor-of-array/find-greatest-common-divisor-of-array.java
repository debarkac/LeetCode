class Solution {
    public int findGCD(int[] nums) {
        int mini=Integer.MAX_VALUE;
        int maxi=Integer.MIN_VALUE;
        for(int i=0;i<nums.length;i++){
            mini=Math.min(mini,nums[i]);
            maxi=Math.max(maxi,nums[i]);
        }

        for(int i=mini;i>=1;i--){
            if(maxi%i==0 && mini%i==0)
                return i;
        }

        return 1;
    }
}