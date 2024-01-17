/**
 * Definition for a binary tree node.
 * struct TreeNode {
 *     int val;
 *     TreeNode *left;
 *     TreeNode *right;
 *     TreeNode() : val(0), left(nullptr), right(nullptr) {}
 *     TreeNode(int x) : val(x), left(nullptr), right(nullptr) {}
 *     TreeNode(int x, TreeNode *left, TreeNode *right) : val(x), left(left), right(right) {}
 * };
 */
class Solution {

public:
    int maximum=0;
    int maxi(TreeNode* root,int n){
        if(root==NULL)
            return 0;
        
        int leftHeight=maxi(root->left,maximum);
        int rightHeight=maxi(root->right,maximum);
        maximum=max(maximum,leftHeight+rightHeight);
        return 1+max(leftHeight,rightHeight);
    }
    int diameterOfBinaryTree(TreeNode* root) {
        maxi(root,maximum);
        return maximum;
    }
};