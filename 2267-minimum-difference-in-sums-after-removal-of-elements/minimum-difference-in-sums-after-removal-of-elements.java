class Solution {
    public long minimumDifference(int[] nums) {
        int n=nums.length/3;
        int len=nums.length;

        PriorityQueue<Integer> maxHeap=new PriorityQueue<>(Collections.reverseOrder());
        long[] left=new long[len];
        long sum=0;

        for(int i=0;i<len;i++){
            maxHeap.add(nums[i]);
            sum=sum+nums[i];
            if(maxHeap.size()>n)
                sum-=maxHeap.poll();

            if(i>=n-1){
                left[i]=sum;
            }
        }

        PriorityQueue<Integer> minHeap=new PriorityQueue<>();
        long right[]=new long[len+1];
        sum=0;

        for(int i=len-1;i>=0;i--){
            minHeap.add(nums[i]);
            sum=sum+nums[i];
            if(minHeap.size()>n)
                sum-=minHeap.poll();
            
            if(i<=len-n)
                right[i]=sum;
        }

        long ans=Long.MAX_VALUE;
        for(int i=n-1;i<2*n;i++){
            ans=Math.min(ans,left[i]-right[i+1]);
        }

        return ans;

    }
}