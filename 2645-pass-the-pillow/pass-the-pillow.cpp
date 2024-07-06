class Solution {
public:
    int passThePillow(int n, int time) {
        int i=1;
        int j=1;
        while(1){
            i=i+j;
            time--;
            if(time==0)
                return i;
            if(i==n && time!=0)
                j=j*(-1);
            if(i==1 && time!=0)
                j=j*(-1);
        }
        return 0;
    }
};