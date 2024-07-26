class Solution {
public:
    /*int count(int ind,int sum,int target,vector<int> nums,int n){
        if(ind==n){
            if(sum<=target)
                return 1;
            else
                return 0;
        }
        int right=count(ind+1,sum,target,nums,n);
        int left=0;
        sum=sum+nums[ind];
        left=count(ind+1,sum,target,nums,n);
        //sum=sum-nums[ind];
        //int right=count(ind+1,sum,target,nums,n);
        return right+left;
    }*/
    int numSubseq(vector<int>& nums, int target) {
        sort(nums.begin(),nums.end());
        int MOD=1000000007;
        int ans=0;
        int left=0,right=nums.size()-1;
        vector<int> p(nums.size());
        p[0]=1;
        for(int i=1;i<nums.size();i++){
            p[i]=p[i-1]*2;
            p[i]=p[i]%MOD;
        }
        while(left<=right){
            if(nums[left]+nums[right]<=target){
                ans=ans+p[right-left];
                ans=ans%MOD;
                left++;
            }
            else
                right--;
        }
        return ans;
    }
};