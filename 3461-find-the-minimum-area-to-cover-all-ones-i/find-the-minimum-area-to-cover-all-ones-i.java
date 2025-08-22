class Solution {
    public int minimumArea(int[][] grid) {
        int area=0;
        int maxRow=0,maxCol=0,minRow=Integer.MAX_VALUE,minCol=Integer.MAX_VALUE;


        for(int i=0;i<grid.length;i++){
            for(int j=0;j<grid[0].length;j++){
                if(grid[i][j]==1){
                    minRow=Math.min(minRow,i);
                    minCol=Math.min(minCol,j);
                    maxRow=Math.max(maxRow,i);
                    maxCol=Math.max(maxCol,j);
                }
            }
        }


        minRow=minRow+1;
        minCol=minCol+1;
        maxRow=maxRow+1;
        maxCol=maxCol+1;

        area=(maxRow-minRow+1)*(maxCol-minCol+1);

        return area;
    }
}