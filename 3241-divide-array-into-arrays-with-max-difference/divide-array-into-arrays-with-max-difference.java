class Solution {
    public int[][] divideArray(int[] nums, int k) {
        Arrays.sort(nums);
        List<List<Integer>> check=new ArrayList<>();
        int i=0;
        while(i<nums.length){
            if(nums[i+2]-nums[i]<=k){
                List<Integer> dup=new ArrayList<>();
                dup.add(nums[i]);
                dup.add(nums[i+1]);
                dup.add(nums[i+2]);
                check.add(dup);
            }
            else
                return new int[0][0];
            
            i=i+3;
        }

        int arr[][]=new int[check.size()][3];
        for(i=0;i<check.size();i++){
            for(int j=0;j<3;j++){
                arr[i][j]=check.get(i).get(j);
            }
        }
        return arr;
    }
}