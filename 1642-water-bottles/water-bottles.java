class Solution {
    public int numWaterBottles(int numBottles, int numExchange) {
        int res=0;
        int numEmpty=0;
        while(numBottles>0){
            res=res+numBottles;
            numBottles=numBottles+numEmpty;
            numEmpty=numBottles%numExchange;
            numBottles=numBottles/numExchange;
        }
        return res;
    }
}