class Solution {
public:
    int check(vector<int> left){
        int c=0;

        
        for(int i=0;i<left.size();i++){
            if(left[i]==0)
                c++;
        }
        return c;
    }

    int check_ones(vector<int> right){
        int c=0;

        
        for(int i=0;i<right.size();i++){
            if(right[i]==1)
                c++;
        }
        return c;
    }

    int maxScore(string s) {
        vector<int> arr;
        for(int i=0;i<s.length();i++){

            char digit=s[i]-'0';
            arr.push_back(digit);
        }
        int score=0;
        int k=1;
        for(int i=0;i<arr.size()-1;i++){
            vector<int> left;
            vector<int> right;
            for(int j=0;j<k;j++){
                left.push_back(arr[j]);
            }
            for(int j=k;j<arr.size();j++){
                right.push_back(arr[j]);
            }
            k++;
            int l=check(left);
            int r=check_ones(right);
            score=(l+r)>score?(l+r):score;
        }
        return score;
    }
};