class Solution {
    public int mostWordsFound(String[] sentences) {
        int maxi=Integer.MIN_VALUE;
        for(int i=0;i<sentences.length;i++){
            sentences[i]=sentences[i]+" ";
            int len=0;
            for(int j=0;j<sentences[i].length();j++){
                if(sentences[i].charAt(j)==' '){
                    len++;
                }
            }
            maxi=Math.max(len,maxi);
        }
        return maxi;
    }
}