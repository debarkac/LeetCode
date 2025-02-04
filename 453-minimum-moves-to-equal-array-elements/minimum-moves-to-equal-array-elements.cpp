class Solution {
public:
    int minMoves(vector<int>& nums) {
        int count=0;
        sort(nums.begin(),nums.end());
        for(int i=0;i<nums.size()-1;i++){
            int check=nums[i+1];
            int difference=check-nums[i];
            count=count+difference;
            for(int j=0;j<nums.size();j++){
                if(nums[j]==check && j==(i+1))
                    continue;
                nums[j]=nums[j]+difference;
            }
        }
        return count;
    }
};