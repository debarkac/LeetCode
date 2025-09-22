class Solution {
    public int search(int[] nums, int target) {
        int upper=nums.length-1;
        int lower=0;
        while(lower<=upper){
            int mid=lower+(upper-lower)/2;
            if(target>nums[mid]){
                lower=mid+1;
            }
            else if(target<nums[mid]){
                upper=mid-1;
            }
            else
                return mid;
        }
        return -1;
    }
}