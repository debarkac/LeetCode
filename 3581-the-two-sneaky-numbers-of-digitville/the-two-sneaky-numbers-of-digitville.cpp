class Solution {
public:
    vector<int> getSneakyNumbers(vector<int>& nums) {
        unordered_map<int,int> umap;
        for(int i=0;i<nums.size();i++){
            umap[nums[i]]++;
        }
        vector<int> result;
        for(auto it:umap){
            if(it.second>1)
                result.push_back(it.first);
        }
        return result;
    }
};