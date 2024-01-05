class Solution {
public:
    long long smallestNumber(long long num) {
        //int l=(int)math.log10(num)+1;
        vector <long long> arr;
        long long n=abs(num);
        //for(int i=0;i<l;i++){
        while(n>0){
            arr.push_back(n%10);
            n=n/10;
        }
        if(num>0){
            sort(arr.begin(),arr.end());
            if(arr[0]==0 && arr[1]!=0){
                int c=arr[1];
                arr[1]=0;
                arr[0]=c;
            }
            else if(arr[0]==0 && arr[1]==0){
                int index=0;
                for(int i=0;;i++){
                    if(arr[i]==0 && arr[i+1]!=0){
                        index=i;
                        break;
                    }
                }
                arr[0]=arr[index+1];
                for(int i=1;i<=index+1;i++)
                    arr[i]=0;
            }
        }
        else{
             sort(arr.rbegin(), arr.rend());
        }
        n=0;
        for(int i=0;i<arr.size();i++){
            n=n*10+arr[i];
        }
        if(num<0)
            n*=-1;
        return n;
    }
};