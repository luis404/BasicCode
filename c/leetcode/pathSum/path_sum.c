#include <stdio>
#include <stdlib>

struct TreeNode {
     int val;
     struct TreeNode *left;
     struct TreeNode *right;
 };

bool hasPathSum(struct TreeNode *root, int sum) {
    bool result;
    if(!root) return false;
    if(!root->left && !root->right){
        if(sum == root->val) return true;
        else return false;
    }
    
    if(root->left) {
       result = hasPathSum(root->left, sum-root->val);
       if(result) return true;
       else if(root->right){
           return hasPathSum(root->right, sum-root->val);;
       }
    } else return hasPathSum(root->right, sum- root->val);
    
    return false;
}

int main(int argc, char **argv){

}
