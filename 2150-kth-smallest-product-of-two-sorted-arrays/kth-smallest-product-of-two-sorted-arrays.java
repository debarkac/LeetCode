class Solution {
    private long count(int a[],int b[],long target){
        long c=0;
        for(int i=0;i<a.length;i++){
            long num=a[i];
            if(num==0){
                if(target>=0)
                    c=c+b.length;
                continue;
            }
            int low=0,high=b.length;
            while(low<high){
                int mid=low+(high-low)/2;
                long product=(long)num*b[mid];
                if(product<=target){
                    if(num>0)
                        low=mid+1;
                    else
                        high=mid;
                }
                else{
                    if(num>0)
                        high=mid;
                    else
                        low=mid+1;
                }
            }
            c+=(num>0)?low:b.length-low;
        }
        return c;
    }
    public long kthSmallestProduct(int[] nums1, int[] nums2, long k) {
        long l=-10000000000L,r=10000000000L;
        long res=0;
        while(l<r){
            long mid=l+(r-l)/2;
            if(count(nums1,nums2,mid)<k){
                l=mid+1;
            }
            else
                r=mid;
        }
        return l;
    }
}