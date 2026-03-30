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
    public TreeNode insertIntoBST(TreeNode root, int val) {
        TreeNode newNode = new TreeNode(val);

        if(root==null) return newNode;

        TreeNode prev=null;
        TreeNode ptr=root;

        while(ptr!=null) {
            prev=ptr;

            if(val<ptr.val) {
                ptr=ptr.left;
            } else {
                ptr=ptr.right;
            }
        }

        if(val<prev.val) {
            prev.left=newNode; 
        } else {
            prev.right=newNode;
        }

        return root;
    }
}