class Solution {
public:
    vector<int> twoSum(vector<int>& nums, int target) {
        //better solution using hashmap
        map<int,int> mpp;
        for(int i=0;i<nums.size();i++){
            int a=nums[i];
            int more=target-a;//storing the remaining value from target which is required
            if(mpp.find(more)!=mpp.end()){//finding more in the hashmap
                return {mpp[more],i};
            }
            mpp[a]=i;
        }
        return {-1,-1};
    }
};