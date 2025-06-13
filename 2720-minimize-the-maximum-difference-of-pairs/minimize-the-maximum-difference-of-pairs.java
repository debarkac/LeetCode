class Solution {
    private int countValidPairs(int[] nums,int limit){
        int i=0,c=0;
        while(i<nums.length-1){
            if(nums[i+1]-nums[i]<=limit){
                c++;
                i++;
            }
            i++;
        }
        return c;
    }
    public int minimizeMax(int[] nums, int p) {
        Arrays.sort(nums);
        int n=nums.length;
        int l=0,r=nums[n-1]-nums[0];

        while(l<r){
            int mid=l+(r-l)/2;

            if(countValidPairs(nums,mid)>=p)
                r=mid;
            else
                l=mid+1;
        }
    return l; 
    }
}