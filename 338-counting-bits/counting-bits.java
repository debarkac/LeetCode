class Solution {
    private int countOne(int num){
        String bin=Integer.toBinaryString(num);
        int count=0;
        for(int i=0;i<bin.length();i++){
            if(bin.charAt(i)=='1')
                count++;
        }
        return count;
    }
    public int[] countBits(int n) {
        int arr[]=new int[n+1];
        arr[0]=0;
        for(int i=1;i<=n;i++){
            arr[i]=countOne(i);
        }
        return arr;
    }
}