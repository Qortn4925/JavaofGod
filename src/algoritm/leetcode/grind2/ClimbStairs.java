package algoritm.leetcode.grind2;

public class ClimbStairs {

   static int climbStairs(int n ) {
        if(n<=2) return  n;
        // 4 에 도달하는 버은 2, 2 와 같냐 , << 이거 부터 하면 되는거잖아 ,
        // 1,1,1,1    2,2  1,2,1  2,1,1  ,1,1,2   //  (1,1) ,(2)   (1, 1) ,(2)

        return  climbStairs(n-2) + climbStairs(n-1) ;
        //결국 맨 마지막엔  n-2 +1칸  + n-1 칸 간거니까 2*n-2 +1 했는데 << 마지막 만 이렇게 해야하는듯?? 사실 잘 ㅗㅁ르겠음
//            return  2*climbStairs(n-2) +1;
    }

    static  int climbStairs2(int n ,int start ,int [] cashe) {
       if(start>n) return 0;
    else if(n==start)  return 1;

     else if(cashe[start]!=0)  return cashe[start];

     int result =climbStairs2(n,start+1,cashe)+climbStairs2(n,start+2,cashe);
     cashe[start]=result;
     return result;
    }

   static int climbStairs3(int n,int [] memo) {
       if (n<2) return  n;

       if(memo[0]!= 0) return  memo[n];

        System.out.println("memo = " + memo[n]);

       int result = climbStairs3(n-2,memo) +climbStairs3(n-1,memo);
       memo[n]=result;
       return result;
    }


    public static void main(String[] args) {

        System.out.println(climbStairs(5));
int [] cashe =new int [6];

        System.out.print(climbStairs3(5,cashe));


    }
}
