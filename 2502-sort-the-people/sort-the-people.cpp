class Solution {
public:
    vector<string> sortPeople(vector<string>& names, vector<int>& heights) {
        vector<string> ans;
        //sort(heights.begin(),heights.end(),greater<int>());
        for(int i=0;i<names.size();i++){
            int k=0;
            int maxi=INT_MIN;
            for(int j=0;j<names.size();j++){
                if(maxi<heights[j]){
                    maxi=heights[j];
                    k=j;
                }
            }
            ans.push_back(names[k]);
            heights[k]=-1;


        }
        return ans;
    }
};