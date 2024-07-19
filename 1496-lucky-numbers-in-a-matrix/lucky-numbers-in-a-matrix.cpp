class Solution {
public:
    vector<int> luckyNumbers (vector<vector<int>>& matrix) {
        vector<int> ans;
        int row=INT_MAX;
        int col=0,k=0;
        for(int i=0;i<matrix.size();i++){
            row=INT_MAX;
            for(int j=0;j<matrix[0].size();j++){
                row=min(row,matrix[i][j]);
                if(row==matrix[i][j])
                    k=j;
            }
            col=row;

            for(int j=0;j<matrix.size();j++){
                col=max(col,matrix[j][k]);
            }
            if(row==col)
                ans.push_back(row);
        }
        return ans;
    }
};