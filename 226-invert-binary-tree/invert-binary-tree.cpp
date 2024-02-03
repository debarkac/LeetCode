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
    void swap(TreeNode* root){
        TreeNode* curr=root;
        if(!curr)
            return;
        
        swap(curr->left);
        swap(curr->right);
        TreeNode* t=curr->left;
        curr->left=curr->right;
        curr->right=t;
    }
    TreeNode* invertTree(TreeNode* root) {
        swap(root);
        return root;
    }
};