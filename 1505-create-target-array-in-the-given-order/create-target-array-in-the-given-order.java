class Solution {
    public int[] createTargetArray(int[] nums, int[] index) {
        int target[]=new int[nums.length];
        ArrayList<Integer> res=new ArrayList<>();
        for(int i=0;i<nums.length;i++){
            res.add(index[i],nums[i]);
        }
        for(int i=0;i<nums.length;i++){
            target[i]=res.get(i);
        }
        return target;
    }
}