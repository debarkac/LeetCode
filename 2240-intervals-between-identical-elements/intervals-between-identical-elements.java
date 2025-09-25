class Solution {
    public long[] getDistances(int[] arr) {
        long res[]=new long[arr.length];
        HashMap<Integer,ArrayList<Integer>> map=new HashMap<>();

        for(int i=0;i<arr.length;i++){
            if(!map.containsKey(arr[i]))
                map.put(arr[i],new ArrayList<>());
            map.get(arr[i]).add(i);
        }

        for(ArrayList<Integer> indices:map.values()){
            long total_sum=0;
            for(int i=0;i<indices.size();i++){
                total_sum=total_sum+indices.get(i);
            }

            long left_size=0;
            long right_size=0;
            long left_sum=0;
            long right_sum=0;
            for(int i=0;i<indices.size();i++){
                left_size=i;
                right_size=indices.size()-i-1;
                right_sum=total_sum-left_sum-indices.get(i);
                res[indices.get(i)]=(left_size*indices.get(i)-left_sum)+(right_sum-right_size*indices.get(i));
                left_sum=left_sum+indices.get(i);
            }            
        }
        return res;
    }
}