class Solution {
    public List<Integer> findDisappearedNumbers(int[] nums) {
        int len=nums.length;
        HashMap<Integer,Integer> map=new HashMap<>();
        for(int i=0;i<len;i++){
            int key=nums[i];
            map.put(key,map.getOrDefault(key,0)+1);
        }

        List<Integer> res=new ArrayList<>();
        for(int i=1;i<=len;i++){
            if(!map.containsKey(i))
                res.add(i);
        }
        
        return res;

    }
}