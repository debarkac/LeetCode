class Solution {
    public int sumBase(int n, int k) {
        int sum=0;
        int convert=0;
        while(n>0){
            if(n<k)
                convert=convert*10+n;
            else
                convert=convert*10+n%k;
            n=n/k;
        }

        while(convert>0){
            sum=sum+convert%10;
            convert=convert/10;
        }
        return sum;
    }
}