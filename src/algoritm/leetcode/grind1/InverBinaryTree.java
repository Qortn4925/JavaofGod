package algoritm.leetcode.grind1;

public class InverBinaryTree {

    public class TreeNode {
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

    public TreeNode invertTree(TreeNode root) {
        //종료 조건
        if(root==null ){
            return root;
        }
        TreeNode temp = new TreeNode();

        temp=root.left;
        root.left=root.right;
        root.right = temp;

        invertTree(root.left);
        invertTree(root.right);
        return root;
    }


}
