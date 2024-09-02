class Solution {
public:
    int chalkReplacer(vector<int>& chalk, int k) {
        int n=chalk.size();
        long long int sum=0;
        for(int i=0;i<n;i++){
            sum=sum+chalk[i];
        }

        int remainder=k%sum;
        for(int i=0;i<n;i++){
            remainder=remainder-chalk[i];
            if(remainder<0)
                return i;
        }
        return 0;
    }
};