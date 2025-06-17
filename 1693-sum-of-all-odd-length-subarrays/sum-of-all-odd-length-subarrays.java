class Solution {
    public int sumOddLengthSubarrays(int[] arr) {
        int sum=0;

        int pre[]=new int[arr.length+1];
        pre[0]=0;
        for(int i=1;i<=arr.length;i++){
            pre[i]=pre[i-1]+arr[i-1];
        }

        for(int i=1;i<=arr.length;i=i+2){
            for(int j=0;j<=arr.length-i;j++){
                sum=sum+pre[i+j]-pre[j];
            }
        }

        return sum;
    }
}