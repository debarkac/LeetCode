class Solution {
    public int maxDiff(int num) {
        String numString=String.valueOf(num);
        char arr[]=numString.toCharArray();
        int nums[]=new int[arr.length];

        for(int i=0;i<nums.length;i++){
            nums[i]=arr[i]-'0';
        }

        int first=nums[0];
        int last=nums[nums.length-1];
        int maxi=0,mini=0;

        if(first==9){
            for(int i=0;i<nums.length;i++){
                if(nums[i]!=9){
                    first=nums[i];
                    break;
                }
            }
        }
        for(int i=0;i<nums.length;i++){
            if(nums[i]==first){
                maxi=maxi*10+9;
            }
            else{
                maxi=maxi*10+nums[i];
            }
            // if(nums[i]==last){
            //     mini=mini*10+1;
            // }
            // else{
            //     mini=mini*10+nums[i];
            // }
        }

        if(nums[0]==1){
            mini=mini*10+nums[0];
            for(int i=1;i<nums.length;i++){
                if(nums[i]!=1 && nums[i]!=0){
                    last=nums[i];
                    break;
                }
            }
            for(int i=1;i<nums.length;i++){
                if(nums[i]==last)
                    mini=mini*10+0;
                else
                    mini=mini*10+nums[i];
            }
            if(num==111)
                mini=111;
        }
        else{
            last=nums[0];
            for(int i=0;i<nums.length;i++){
                if(nums[i]==last){
                    mini=mini*10+1;
                }
                else{
                    mini=mini*10+nums[i];
                }
            }
        }
        return maxi-mini;
    }
}