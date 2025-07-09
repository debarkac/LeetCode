class Solution {
    public int maxFreeTime(int eventTime, int k, int[] startTime, int[] endTime) {
        int N=startTime.length;
        int gaps[]=new int[N+1];

        gaps[0]=startTime[0];
        for(int i=1;i<N;i++){
            gaps[i]=startTime[i]-endTime[i-1];
        }

        gaps[N]=eventTime-endTime[N-1];

        int maxFreeTime=0;
        int currWindowSum=0;
        int l=0;

        for(int r=0;r<gaps.length;r++){
            currWindowSum=currWindowSum+gaps[r];

            if(r-l+1>k+1){
                currWindowSum=currWindowSum-gaps[l];
                l++;
            }

            if(r-l+1==k+1){
                maxFreeTime=Math.max(maxFreeTime,currWindowSum);
            }
        }
        return maxFreeTime;
    }
}