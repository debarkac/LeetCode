class Solution {
    public int minMaxDifference(int num) {
        int len=(int)Math.log10(num)+1;
        int arr[]=new int[len];
        for(int i=arr.length-1;i>=0;i--){
            arr[i]=num%10;
            num=num/10;
        }

        int maxi=0,mini=0,firstNum=0,digit=0;
        for(int i=0;i<arr.length;i++){
            if(i==0){
                digit=arr[i];
            }
            if(arr[i]!=9){
                firstNum=arr[i];
                break;
            }
        }
        for(int i=0;i<arr.length;i++){
            if(arr[i]==firstNum){
                maxi=maxi*10+9;
            }
            else{
                maxi=maxi*10+arr[i];
            }
            if(arr[i]==digit){
                mini=mini*10+0;
            }
            else{
                mini=mini*10+arr[i];
            }

        }
        return maxi-mini;
    }
}