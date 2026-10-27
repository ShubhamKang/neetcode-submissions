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
    int count = 0;
    public int kthSmallest(TreeNode root, int k) {
        return kthsmall(root,k);
    }
    public int kthsmall(TreeNode root,int k){
        if(root == null) return -1;
        int left = kthsmall(root.left,k);
        if(left != -1) return left;
        count += 1;;
        if(count == k) return root.val;
        else{
            return kthsmall(root.right,k);
        }

    }
}
