class Solution {
    public int maximumLength(int[] nums) {
        int maxi=0;
        int odd=0,even=0,alternateOdd=0,alternateEven=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]%2==0){
                even++;
                alternateEven=alternateOdd+1;
            }
            else{
                odd++;
                alternateOdd=alternateEven+1;
            }            
        }
        maxi=Math.max(Math.max(even,odd),Math.max(alternateEven,alternateOdd));
        return maxi;
    }
}