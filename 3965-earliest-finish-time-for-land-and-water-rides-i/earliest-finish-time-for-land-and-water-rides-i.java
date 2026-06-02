class Solution {
    public int earliestFinishTime(int[] landStartTime, int[] landDuration, int[] waterStartTime, int[] waterDuration) {
        int land = landStartTime.length;
        int water = waterStartTime.length;
        int minTime = Integer.MAX_VALUE;
        int time = 0;

        for(int i = 0;i < land; i++){
            for(int j = 0; j < water; j++){
                time = landStartTime[i] + landDuration[i];
                time = Math.max(time, waterStartTime[j]) + waterDuration[j];
                minTime = Math.min(time, minTime);
            }
        }

        for(int i=0; i<water; i++){
            for(int j=0; j<land; j++){
                time = waterStartTime[i] + waterDuration[i];
                time = Math.max(time, landStartTime[j]) + landDuration[j];
                minTime = Math.min(time, minTime);
            }
        }
        return minTime;
    }
}