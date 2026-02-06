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
    public void inorder(TreeNode root, List<Integer> trav){
        if(root != null){
            inorder(root.left, trav);
            trav.add(root.val);
            inorder(root.right, trav);
        }
    }
    public boolean checkList(List<Integer> trav){
        for(int i = 1; i < trav.size(); i++){
            if(trav.get(i) <= trav.get(i - 1)){
                return false;
            }
        }
        return true;
    }
    public boolean isValidBST(TreeNode root) {
        List<Integer> trav = new ArrayList<>();
        inorder(root,trav);
        boolean result = checkList(trav) ;
        return result;
    }
}