class Solution {
    public boolean checkIfPangram(String sentence) {
        Set<Character> set=new HashSet<>();
        for(int i=0;i<sentence.length();i++){
            char c=sentence.charAt(i);
            set.add(c);
        }

        if(set.size()==26)
            return true;

        return false;
    }
}