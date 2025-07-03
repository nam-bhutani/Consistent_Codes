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
    public TreeNode sortedArrayToBST(int[] nums) {
        int s=0;
        int e=nums.length-1;
        TreeNode root=helper(nums,s,e);
        return root;
    }
    private TreeNode helper(int nums[],int st,int ed){
        if(st>ed) return null;
        int mid=st+((ed-st)/2);
        TreeNode root=new TreeNode(nums[mid]);
        root.left=helper(nums, st, mid-1);
        root.right=helper(nums, mid+1, ed);
        return root;
    }
}
