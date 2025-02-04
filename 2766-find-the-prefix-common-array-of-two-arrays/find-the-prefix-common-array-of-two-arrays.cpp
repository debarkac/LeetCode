class Solution {
public:
    vector<int> findThePrefixCommonArray(vector<int>& A, vector<int>& B) {
        int n=A.size();
        vector<int> result;
        vector<int> freq(n+1,0);
        int count=0;
        for(int i=0;i<A.size();i++){
            freq[A[i]]++;
            freq[B[i]]++;
            for(int j=0;j<=n;j++){
                if(freq[j]==2){
                    count++;
                    freq[j]=-1;
                }
            }
            result.push_back(count);
        }        
        return result;
    }
};