class Solution {
public:
    int findKthLargest(vector<int>& nums, int k) {
        sort(nums.begin(),nums.end(),greater<int>());
        int element=0;
        for(int i=0;i<k;i++){
            element=nums[i];
        }
        
        return element;
    }
};