class Solution {
public:
    void reverseString(vector<char>& s) {
        reverse(s.begin(),s.begin()+(s.size()));
    }
};