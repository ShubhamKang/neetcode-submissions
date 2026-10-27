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
        int min = Integer.MIN_VALUE;
        int max = Integer.MAX_VALUE;
        return validate(root,min,max);
    }
    boolean validate(TreeNode root, int min , int max){
        if(root == null) return true;
        if(root.val <= min || root.val >= max) return false;
        if ((root.left != null && root.left.val > root.val) || (root.right != null &&           root.right.val <= root.val)) return false;
       return validate(root.left,min,root.val) && validate(root.right,root.val,max);
    }   
}
