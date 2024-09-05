class Solution {
public:
    vector<int> missingRolls(vector<int>& rolls, int mean, int n) {
        int sum=0;
        vector<int> result;
        for(int i=0;i<rolls.size();i++){
            sum=sum+rolls[i];
        }
        int sum_of_n=0;
        sum_of_n=((mean*(rolls.size()+n))-sum);
        if(sum_of_n>n*6 || sum_of_n<n)
            return result;

        int distribute=sum_of_n/n;
        int modu=sum_of_n%n;

        for(int i=0;i<n;i++){
            result.push_back(distribute);
        }
        for(int i=0;i<modu;i++){
            result[i]++;
        }
        return result;
    }
};