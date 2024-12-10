#include <bits/stdc++.h>
class Solution {
public:
    int maxArea(vector<int>& height) {
        int maxi=INT_MIN;
        int low=0;
        int high=height.size()-1;
        int area=0;
        while(low<=high){
            area=(high-low)*min(height[low],height[high]);
            maxi=area>=maxi?area:maxi;
            if(height[low]<=height[high])
                low=low+1;
            else
                high=high-1;
        }
        return maxi;
    }
};