class Solution {
    public boolean judgeCircle(String moves) {
        int count_L=0,count_R=0,count_U=0,count_D=0;
        for(int i=0;i<moves.length();i++){
            if(moves.charAt(i)=='L')
                count_L++;
            else if(moves.charAt(i)=='R')
                count_R++;
            else if(moves.charAt(i)=='U')
                count_U++;
            else
                count_D++;
        }

        if(count_L==count_R && count_U==count_D)
            return true;
        
        return false;
    }
}