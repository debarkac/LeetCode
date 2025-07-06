class FindSumPairs {

    private int[] nums1;
    private int[] nums2;
    private Map<Integer,Integer> count;
    public FindSumPairs(int[] nums1, int[] nums2) {
        this.nums1=nums1;
        this.nums2=nums2;
        this.count=new HashMap<>();

        for(int num:nums2){
            count.put(num,count.getOrDefault(num,0)+1);
        }
    }
    
    public void add(int index, int val) {
        int oldValue=nums2[index];
        nums2[index]=nums2[index]+val;
        int newValue=nums2[index];

        count.put(oldValue,count.get(oldValue)-1);
        if(count.get(oldValue)==0)
            count.remove(oldValue);
        
        count.put(newValue,count.getOrDefault(newValue,0)+1);
    }
    
    public int count(int tot) {
        int totalPair=0;
        for(int i=0;i<nums1.length;i++){
            int target=tot-nums1[i];
            totalPair=totalPair+count.getOrDefault(target,0);
        }
        return totalPair;
    }
}

/**
 * Your FindSumPairs object will be instantiated and called as such:
 * FindSumPairs obj = new FindSumPairs(nums1, nums2);
 * obj.add(index,val);
 * int param_2 = obj.count(tot);
 */