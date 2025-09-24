package algoritm.leetcode.grind1;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

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


    // Queue를 통한 bfs 구현
    public TreeNode invertTree2(TreeNode root){


        Queue<TreeNode> queue = new LinkedList<>();
        queue.add(root);

        while(!queue.isEmpty()){
            TreeNode current = queue.poll();

            TreeNode temp = current.left;
            current.left=current.right;
            current.right=temp;

            if(current.left!=null) queue.add(current.left);
            if(current.right!=null) queue.add(current.right);
        }
return  root;
    }

    public TreeNode invertTree3(TreeNode root) {
        if(root==null ){
            return root;
        }

        Stack<TreeNode> stack = new Stack<>();
        stack.add(root);
        while(!stack.isEmpty()){
            TreeNode current = stack.pop();

            TreeNode temp = current.left;
            current.left=current.right;
            current.right=temp;

            if(current.right!=null) stack.push(current.right);
            if(current.left!=null) stack.push(current.left);
        }
        return  root;
    }
}
