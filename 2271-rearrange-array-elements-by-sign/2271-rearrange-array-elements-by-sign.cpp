class Solution {
public:
    vector<int> rearrangeArray(vector<int>& nums) {
        vector<int> pos,neg,res;
        int x=0,y=0;
        for(int i=0;i<nums.size();i++){
            if(nums[i]<0)
                neg.push_back(nums[i]);
            else
                pos.push_back(nums[i]);
        }
        for(int i=0;i<nums.size();i++){
            if(i%2==0){
                if(x<pos.size())
                res.push_back(pos[x++]);
            }
            else{
                if(y<neg.size())
                res.push_back(neg[y++]);
            }
        }
        return res;
    }
};