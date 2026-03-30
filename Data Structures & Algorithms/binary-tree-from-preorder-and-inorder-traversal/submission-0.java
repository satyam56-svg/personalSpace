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
    public TreeNode buildTree(int[] preorder, int[] inorder) {
        int n=preorder.length;
        return helper(preorder,0,n-1,inorder,0,n-1);
    }

    public TreeNode helper(int preOrder[], int preLo, int preHi, int inOrder[], int inLo, int inHi) {
        if(preLo>preHi) return null;
        TreeNode root=new TreeNode(preOrder[preLo]);
        int i=inLo;
        while(inOrder[i]!=preOrder[preLo]) i++;
        int leftSize=i-inLo;
        root.left=helper(preOrder,preLo+1,preLo+leftSize,inOrder,inLo,i-1);
        root.right=helper(preOrder,preLo+1+leftSize,preHi,inOrder,i+1,inHi);
        return root;
    }
}
