class Solution {
    private int findBest(int index, int k, int[] nums, long[] prefixSum){
        int target=nums[index];

        int i=0,j=index,result=index;

        while(i<=j){
            int mid=i+(j-i)/2;
            long count=index-mid+1;
            long windowSum=count*target;
            long currSum=prefixSum[index]-prefixSum[mid]+nums[mid];
            int op=(int)(windowSum-currSum);
            if(op>k)
            i=mid+1;
            else{
            result=mid;
            j=mid-1;
            }
        }
        return index-result+1;
    }

    public int maxFrequency(int[] nums, int k) {
        Arrays.sort(nums);
        long prefixSum[]=new long[nums.length];
        prefixSum[0]=nums[0];
        for(int i=1;i<nums.length;i++){
            prefixSum[i]=prefixSum[i-1]+nums[i];
        }

        int result=0;
        for(int i=0;i<nums.length;i++){
            result=Math.max(result,findBest(i,k,nums,prefixSum));
        }
        return result;
    }
}