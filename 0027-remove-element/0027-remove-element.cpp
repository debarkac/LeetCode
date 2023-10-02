class Solution {
public:
    int removeElement(vector<int>& nums, int val) {
        int x=0;
        for(int i=0;i<nums.size();i++){
            if(nums[i]!=val){
                //arr.push_back(nums[i]);
                nums[x++]=nums[i];
            }
        }
        return x;
    }
};