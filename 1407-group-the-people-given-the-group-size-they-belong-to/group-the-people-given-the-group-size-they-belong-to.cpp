class Solution {
public:
    vector<vector<int>> groupThePeople(vector<int>& groupSizes) {
        unordered_map<int,vector<int>> umap;

        vector<vector<int>> result;
        for(int i=0;i<groupSizes.size();i++){
            umap[groupSizes[i]].push_back(i);
            if(umap[groupSizes[i]].size()==groupSizes[i]){
                result.push_back(umap[groupSizes[i]]);
                umap[groupSizes[i]].clear();
            }
        }

        return result;
    }
};