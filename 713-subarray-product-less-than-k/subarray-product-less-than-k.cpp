class Solution {
public:
    int numSubarrayProductLessThanK(vector<int>& nums, int k) {
        if(k<=1)
            return 0;
        int product=1;
        int i=0,j=0;
        int n=nums.size();
        int c=0;
        while(j<n){
            product=product*nums[j];
            while(product>=k){
                product=product/nums[i];
                i++;
            }
            c=c+(j-i+1);
            j++;
        }
        return c;
    }
};