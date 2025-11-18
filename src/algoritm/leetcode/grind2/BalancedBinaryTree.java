package algoritm.leetcode.grind2;

import java.util.Stack;

public class BalancedBinaryTree {

    class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode() {
        }

        TreeNode(int val) {
            this.val = val;
        }

        TreeNode(int val, TreeNode left, TreeNode right) {
            this.val = val;
            this.left = left;
            this.right = right;
        }
    }
        class Solution {
        /*
            public boolean isBalanced(TreeNode root) {


                int leftDepth = checkNode(root.left);
                int rightDepth = checkNode(root.right);

                if (Math.abs(leftDepth - rightDepth) > 1) {
                    return false;
                }

                return isBalanced(root.left) && isBalanced(root.right);
            }

            public int checkNode(TreeNode root) {

                if (root == null) return 0;

                int leftDepth = checkNode(root.left);
                int rightDepth = checkNode(root.right);

                return 1 + Math.max(leftDepth, rightDepth);
            }

         */

            public boolean isBalanced(TreeNode root) {
                Stack<Integer> stack = new Stack<>();
                TreeNode current = new TreeNode();
                while(root!=null) {
                    stack.add(root.val);
//                    current=current.
                }

                return true;
            }

        }

}