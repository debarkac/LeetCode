class Solution {
public:
    int findTheWinner(int n, int k) {
        vector<int> a;
        for(int i=0;i<n;i++){
            a.push_back(i+1);
        }
        int j=0;
        while(a.size()>1){
            int next_remove=(j+k-1)%a.size();
            a.erase(a.begin()+next_remove);
            j=next_remove;
        }
        int h=a[0];
        return h;

    }
};