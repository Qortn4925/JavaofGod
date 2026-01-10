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
     // index 찾아서 , 왼쪽 섭트리 그대로 출력 중앙 기준으로 뒤집어서 ,출력
     int[] postOrder( int[] preOrder, int[] inOrder){
          int root = preOrder[0];
          int[] a= new int[preOrder.length];
          a[0]=root;
          int index;
          for(int i=0; i<preOrder.length;i++){
                    if(inOrder[i]==root){
                         index =i;
                    }
          }

          for(int i=0; i<inOrder.length; i++) {
               if( i>0 && i<index) {
                    System.out.println(preOrder[i]);
               }else if( i>index){
                    System.out.println(inOrder[preOrder.length]);
               }
          }
         return a;
     }

}
