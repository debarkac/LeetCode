class Solution {
public:
    int countConsistentStrings(string allowed, vector<string>& words) {
        int count=0;
        for(int i=0;i<words.size();i++){
            string wd=words[i];
            int n=0;
            for(int j=0;j<wd.length();j++){
                if(allowed.find(wd[j])!=string::npos){
                    n++;
                }
            }
            if(n==wd.length())
                count++;
        }
        return count;
    }
};