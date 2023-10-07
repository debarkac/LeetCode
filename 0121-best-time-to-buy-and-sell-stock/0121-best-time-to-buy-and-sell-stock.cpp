class Solution {
public:
    int maxProfit(vector<int>& prices) {
    //brute force approach
    //     int maxP=0;
    //    for(int i=0;i<prices.size();i++){
    //        for(int j=i+1;j<prices.size();j++){
    //            if(prices[j]-prices[i]>maxP)
    //                 maxP=prices[j]-prices[i];
    //        }
    //    }
    //    return maxP;



    int maxP=0,min=INT_MAX;
    for(int i=0;i<prices.size();i++){
        if(prices[i]>min && prices[i]-min>maxP)
            maxP=prices[i]-min;
        else if(prices[i]<min)
            min=prices[i];
    }
    return maxP;
    }
};