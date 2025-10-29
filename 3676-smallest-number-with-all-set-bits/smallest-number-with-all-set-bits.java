class Solution {
    public int smallestNumber(int n) {
        int output=n;
        while(true){
            if(!Integer.toBinaryString(output).contains("0"))
                return output;
            output++;
        }
    }
}