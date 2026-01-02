package algoritm.leetcode.grind2;

import java.util.ArrayList;
import java.util.List;

public class BinaryTreeLevelOrderTraversal102 {

    class TreeNode {
      int val;
      TreeNode left;
      TreeNode right;
      TreeNode() {}
      TreeNode(int val) { this.val = val; }
      TreeNode(int val, TreeNode left, TreeNode right) {
          this.val = val;
          this.left = left;
          this.right = right;
      }
  }

    class Solution {
        public List<List<Integer>> levelOrder(TreeNode root) {
            List<List<Integer>> result = new ArrayList<>();
            treeSearch(root,0);

            return  result;
        }

        public TreeNode treeSearch(TreeNode root, int deepth) {
            if(root.left==null && root.right==null) return null;
            treeSearch(root.left,deepth+1);
            treeSearch(root.right,deepth+1);
        }
    }
}
