class Solution {
    public int maximumUniqueSubarray(int[] nums) {
        HashSet<Integer> seen=new HashSet<>();
        int right=0,left=0;
        int sum=0,currentSum=0;
        for(int i=0;i<nums.length;i++){
            while(seen.contains(nums[right])){
                seen.remove(nums[left]);
                currentSum=currentSum-nums[left];
                left++;
            }
            seen.add(nums[right]);
            currentSum=currentSum+nums[right];
            right++;
            sum=Math.max(sum,currentSum);
        }
        return sum;
    }
}