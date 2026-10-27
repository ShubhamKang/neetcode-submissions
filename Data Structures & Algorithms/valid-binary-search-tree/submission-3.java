/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */

class Solution {
    public boolean isValidBST(TreeNode root) {
        return ValidBST(root,1001,-1001);
    }

    public boolean ValidBST(TreeNode root, int maxVal, int minVal){
        if(root == null) return true;

        if(minVal >= root.val || maxVal <= root.val) return false;

        return ValidBST(root.left,root.val,minVal) && ValidBST(root.right,maxVal,root.val);
    }
}
