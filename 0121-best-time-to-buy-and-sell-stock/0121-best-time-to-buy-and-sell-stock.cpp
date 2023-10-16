class Solution {
public:
    int maxProfit(vector<int>& prices) {
        int maxP=0,min=INT_MAX;
        for(int i=0;i<prices.size();i++){
            if(prices[i]>min && prices[i]-min>maxP)
                maxP=prices[i]-min;
            else if(min>prices[i])
                min=prices[i];
        }
        return maxP;
    }
};