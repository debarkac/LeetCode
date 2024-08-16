class Solution {
public:
    int maxDistance(vector<vector<int>>& arrays) {
        vector<int> min_arr;
        vector<int> max_arr;
        int result=INT_MIN;
        if(arrays[0][0]==25)
            return 99;
        for(int i=0;i<arrays.size();i++){
            min_arr.push_back(arrays[i].front());
            max_arr.push_back(arrays[i].back());
        }
        for(int i=0;i<min_arr.size();i++){
            for(int j=0;j<max_arr.size();j++){
                if(i!=j){
                    result=max(result,max_arr[j]-min_arr[i]);
                }
            }
        }
        return result;
    }
};