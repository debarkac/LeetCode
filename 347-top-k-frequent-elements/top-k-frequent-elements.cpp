 bool compare(pair<int,int> &a,pair<int,int> &b){
        return a.second>b.second;
    }
class Solution {
public:
    // bool compare(pair<int,int> &a,pair<int,int> &b){
    //     return a.second>b.second;
    // }

    vector<int> topKFrequent(vector<int>& nums, int k) {
        vector<int> res;
        map<int,int> frequency;
        for(int i=0;i<nums.size();i++){
            frequency[nums[i]]++;
        }
        
        vector<pair<int,int>> frequency_elements(frequency.begin(),frequency.end());
        sort(frequency_elements.begin(),frequency_elements.end(),compare);

        int c=0;
        for(auto pair:frequency_elements){
            res.push_back(pair.first);
            c++;
            if(c==k)
                break;
        }
        return res;
    }
};