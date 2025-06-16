class Solution {
    public int sumCounts(List<Integer> nums) {
        int sum=0;
        for(int i=0;i<nums.size();i++){
            HashSet<Integer> set=new HashSet<>();
            for(int j=i;j<nums.size();j++){
                set.add(nums.get(j));
                int size=set.size();
                sum=sum+(int)Math.pow(size,2);
            }
        }
        return sum;
    }
}