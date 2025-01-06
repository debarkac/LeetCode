class Solution {
public:
    vector<int> minOperations(string boxes) {
        vector<int> answer(boxes.length(),0);
        int cumVal=0;
        int cumValueSum=0;
        for(int i=0;i<boxes.length();i++){
            answer[i]=cumValueSum;
            if(boxes[i]=='0'){
                cumVal=cumVal+0;
            }
            else{
                cumVal=cumVal+1;
            }
            cumValueSum=cumValueSum+cumVal;
        }

        cumVal=0;
        cumValueSum=0;
        for(int i=boxes.length()-1;i>=0;i--){
            answer[i]+=cumValueSum;
            if(boxes[i]=='0'){
                cumVal+=0;
            }
            else{
                cumVal+=1;
            }
            cumValueSum+=cumVal;
        }
        return answer;
    }
};