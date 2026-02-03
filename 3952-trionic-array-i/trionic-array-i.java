class Solution {
    public boolean isTrionic(int[] nums) {
        boolean check=true;
        int peak=0;
        int base=0;
        if(!(nums.length>3))
            return false;
        for(int i=0;i<nums.length-1;i++){
            if(nums[i]>nums[i+1] && i==0)
                return false;
            if(nums[i]>nums[i+1]){
                peak=i;
                break;
            }
            else if(nums[i]==nums[i+1])
                return false;
        }
        for(int i=peak;i<nums.length-1;i++){
            if(nums[i]<nums[i+1]){
                base=i;
                break;
            }
            else if(nums[i]==nums[i+1])
                return false;
        }

        for(int i=base;i<nums.length-1;i++){
            if(nums[i]>nums[i+1]){
                check=false;
                break;
            }
            else if(nums[i]==nums[i+1])
                return false;
        }

        if(peak==0 || base==0)
            return false;
        return check;
    }
}