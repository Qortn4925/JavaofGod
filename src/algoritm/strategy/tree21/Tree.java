package algoritm.strategy.tree21;

public class Tree {
     int val ;
     Tree left ;
     Tree right;
}

class  a{

     void printVal(Tree node) {

          if(node ==null) return ;
          System.out.println("node.val = " + node.val);
          printVal(node.left);
          printVal(node.right);
     }
     // Top-down
     int height(Tree node,int curheight) {
          if (node==null) return curheight;
          int leftMax=height(node.left,curheight+1);
          int rightMax=height(node.right,curheight+1);

          curheight= Math.max(leftMax,rightMax);

          return curheight;
     }
}
