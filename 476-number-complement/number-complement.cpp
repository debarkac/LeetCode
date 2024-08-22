class Solution {
public:
    int findComplement(int num) {
        int len=(int)(log2(num)+1);
        unsigned int s=(1U<<len)-1;
        int res=num^s;
        return res;
    }
};