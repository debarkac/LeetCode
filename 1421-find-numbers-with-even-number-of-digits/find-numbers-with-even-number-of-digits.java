class Solution {
    public int findNumbers(int[] nums) {
        int count=0;
        for(int i=0;i<nums.length;i++){
            int digit=nums[i];
            if(((int)Math.log10(digit)+1)%2==0)
                count++;
        }
        return count;
    }
}