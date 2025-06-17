class Solution {
    public int[] findMissingAndRepeatedValues(int[][] grid) {
        int size=grid.length;
        int arr[]=new int[size*size+1];

        for(int i=0;i<size;i++){
            for(int j=0;j<size;j++){
                arr[grid[i][j]]++;
            }
        }

        int moreThanOne=0;
        int missing=0;

        for(int i=0;i<arr.length;i++){
            if(arr[i]==2)
                moreThanOne=i;
            else if(arr[i]==0)
                missing=i;
        }

        int res[]={moreThanOne,missing};
        return res;
    }
}