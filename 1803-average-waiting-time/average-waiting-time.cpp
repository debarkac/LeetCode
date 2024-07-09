class Solution {
public:
    double averageWaitingTime(vector<vector<int>>& customers) {
        vector<int> avg;
        long long time=customers[0][0]+customers[0][1];
        avg.push_back(time-customers[0][0]);
        for(int i=1;i<customers.size();i++){
            if(customers[i][0]>time){
                time=customers[i][0]+customers[i][1];
            }
            else
                time=time+customers[i][1];
            avg.push_back(time-customers[i][0]);
        }
        long time_sum=0;
        for(int i=0;i<avg.size();i++){
            time_sum=time_sum+avg[i];
        }
        double average_time=(double)time_sum/avg.size();
        return average_time;
    }
};