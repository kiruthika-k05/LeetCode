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
    int index = 0;
    public TreeNode buildTree(int[] preorder, int[] inorder) {
        HashMap<Integer,Integer> m = new HashMap<>();
        for(int i = 0; i < inorder.length; i++){
            m.put(inorder[i], i);
        }
        return order(preorder, 0, inorder.length - 1, m);
    }
    public TreeNode order(int[] preorder, int start, int end, HashMap<Integer,Integer> m){
        if(start > end){
            return null;
        }
        int root = preorder[index++];
        TreeNode node = new TreeNode(root);
        int inorderIdx = m.get(root);
        node.left = order(preorder, start, inorderIdx - 1, m);
        node.right = order(preorder, inorderIdx + 1, end, m);

        return node;
    }
}