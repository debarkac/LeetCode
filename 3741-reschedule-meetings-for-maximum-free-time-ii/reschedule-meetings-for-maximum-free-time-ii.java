class Solution {
    public int maxFreeTime(int eventTime, int[] startTime, int[] endTime) {
        int last=0,N=startTime.length,left=0,res=0;
        int right[]=new int[N+1];
        int gaps[]=new int[N+1];

        for(int i=0;i<N;i++){
            gaps[i]=startTime[i]-last;
            last=endTime[i];
        }

        gaps[N]=eventTime-last;

        for(int i=N-1;i>=0;i--){
            right[i]=Math.max(right[i+1],gaps[i+1]);
        }

        for(int i=1;i<=N;i++){
            int time=endTime[i-1]-startTime[i-1];

            if(left>=time || right[i]>=time)
                res=Math.max(res,gaps[i-1]+time+gaps[i]);
            
            left=Math.max(left,gaps[i-1]);
            res=Math.max(res,gaps[i-1]+gaps[i]);
        }

        return res;
    }
}