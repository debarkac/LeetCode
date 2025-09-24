class Solution {
    public List<Integer> findDuplicates(int[] nums) {
        HashSet<Integer> set=new HashSet<>();

        List<Integer> res=new ArrayList<>();
        for(int i=0;i<nums.length;i++){
            if(set.contains(nums[i]))
                res.add(nums[i]);
            set.add(nums[i]);
        }
        return res;
    }
}