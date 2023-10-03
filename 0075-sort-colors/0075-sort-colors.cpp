class Solution {
public:
    void sortColors(vector<int>& nums) {
        /*sort(nums.begin(),nums.end());
        for(int i=0;i<nums.size();i++)
            cout<<nums[i];*/
        int a[3]={0};
        for(int i=0;i<nums.size();i++){
            if(nums[i]==0)
                a[0]++;
            else if(nums[i]==1)
                a[1]++;
            else
                a[2]++;

        }
        for(int i=0;i<nums.size();i++){
            if(a[0]>0){
                nums[i]=0;
                a[0]--;
            }
            else{
                if(a[1]>0){
                    nums[i]=1;
                    a[1]--;
                }
                else{
                    if(a[2]>0){
                        nums[i]=2;
                        a[2]--;
                    }  
                }
            }
            cout<<nums[i];
        }
    }
};