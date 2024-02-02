class Solution {
public:
    // bool checkSeq(int i){
    //     int c=i%10;
    //     i=i/10;
    //     while(i>0){
    //         if((c-1)!=(i%10))
    //             return false;
    //         else{
    //             c=i%10;
    //             i=i/10;
    //         }
    //     }
    //     return true;
    // }

    vector<int> sequentialDigits(int low, int high) {
        vector<int> a;
        int num,next=0;
        for(int i=1;i<=9;i++){
            num=i;
            next = i+1;
            while(num<=high && next<=9){
                num = num*10 + next;
                next++;
                if(num>=low && num<=high) 
                a.push_back(num);
            }
        }
        sort(a.begin(),a.end());
        return a;
    }
};