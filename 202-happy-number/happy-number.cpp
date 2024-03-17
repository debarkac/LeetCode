class Solution {
public:
    bool isHappy(int n) {
        if(((int)log10(n)+1)==1 && (n!=1 && n!=7))
            return false;
        else if(((int)log10(n)+1)==1 && (n==1 || n==7))
            return true;
        while((int)log10(n)+1!=1){
            int x=n;
            n=0;
            while(x>0){
                n=n+pow(x%10,2);
                x=x/10;
            }
            if(n==1 || n==7)
                return true;
        }
        
        return false;

        }
};