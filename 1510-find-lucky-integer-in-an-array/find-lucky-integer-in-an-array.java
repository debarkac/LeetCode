class Solution {
    public int findLucky(int[] arr) {
        Map<Integer,Integer> map=new HashMap<>();
        int res=-1;
        for(int num:arr){
            map.put(num,map.getOrDefault(num,0)+1);
        }

        System.out.println(map);
        for(int key:map.keySet()){
            if(map.get(key)==key)
                res=key;
        }

        return res;
    }
}