package algoritm.leetcode.grind1;

import java.util.Stack;

class TreeNode {
      int val;
      TreeNode left;
      TreeNode right;
      TreeNode(int x) { val = x; }
  }
public class LowestCommonAncestorOfaBinarySearchTree235 {

    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p , TreeNode q) {
    boolean []checkChild  = new boolean[2];
        Stack<TreeNode> stack = new Stack<>();


        return null;
    }

    public TreeNode lowestCommonAncestor2(TreeNode root, TreeNode p , TreeNode q){
        if(root==null) return null;

        if(p.val <root.val && q.val <root.val )   return lowestCommonAncestor(root.left,p,q);
        else if(p.val>root.val && q.val>root.val) return lowestCommonAncestor(root.right,p,q);
        else {return  root;}
    }
}
