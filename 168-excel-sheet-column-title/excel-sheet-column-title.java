class Solution {
    public String convertToTitle(int columnNumber) {
        StringBuilder sb=new StringBuilder();
        while(columnNumber>0){
            columnNumber--;
            int col=columnNumber%26;
            columnNumber=columnNumber/26;
            sb.append((char)(col+'A'));
        }
        return sb.reverse().toString();
    }
}