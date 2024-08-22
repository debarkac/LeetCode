class Solution {
public:
    int countPrimes(int n) {
        if(n==0 || n==1 || n==2)
            return 0;
        if(n==3)
            return 1;
        int c=0;
        vector<int> num(n+1,1);
        for(int i=2;i<n;i++){
            int x=3;
            if(num[i]==1){
                for(int j=i*2;j<=n;){
                    num[j]=0;
                    j=i*x;
                    x++;
                }
                c++;
            }
        }
        return c;
    }
};