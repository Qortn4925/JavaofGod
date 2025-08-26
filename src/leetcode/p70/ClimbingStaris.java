package leetcode.p70;

public class ClimbingStaris {
    public int findPath(int k){

        if(k==1){
            return  1;
        }
        if (k==0){
            return 0;
        }
        if(k==-1){
            return  0;
        }

        return   findPath(k - 1) + findPath(k - 2);
    }
    public int climbStairs(int n) {
        //  1, 1,1
        // 1 1 1 1     ( 순서가 상관 있는 거 잖아 , n)
        //  (2,2)  (1,2,1) , (1,1,1,1)  (2,1,1)   (1,1,2)
        // 앞 뒤가 똑같은 상황 과 ,    순서를 상관 하는 경우 ,
        // n개가 있다면 ,  n개    , 짝 수 , 짝수 x
        // a,b  의 갯수를 조절 해서   > n이 되는거잖아 ,
       int  oneTwo = findPath(n);
        if( n%2==0) {
            // 2가 1개   2,
            return  oneTwo+2 ;
        }
        else {
            return  oneTwo+1;
        }
    }
}
