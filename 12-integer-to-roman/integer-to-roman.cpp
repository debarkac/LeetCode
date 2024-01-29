class Solution {
public:
    string intToRoman(int num) {
        int a[]={1,4,5,9,10,40,50,90,100,400,500,900,1000};
        string s[]={"I","IV","V","IX","X","XL","L","XC","C","CD","D","CM","M"};
        int i=12;
        string ans;
        while(num>0){
            int div=num/a[i];
            num=num%a[i];
            for(int j=0;j<div;j++)
                ans=ans+s[i];
            i--;
        }
        return ans;
    }
};