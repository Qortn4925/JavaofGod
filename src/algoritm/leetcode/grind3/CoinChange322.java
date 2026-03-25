package algoritm.leetcode.grind3;

import java.util.Arrays;
import java.util.Collections;

public class CoinChange322 {
    // ax+by+cz = amount가 되는 최소해를 찾아라 ,   (x,y,z는 실수이며 무한대까지 가능하다)
//    public int coinChange(int[] coins, int amount) {
//
//        Arrays.sort(coins, (a, b) -> Integer.compare(b, a));
//            int result=0;
//        for(int i=0; i<coins.length;i++) {
//            result= result+ amount / coins[i];
//            amount = amount %coins[i];
//        }
//
//        return  amount!=0?-1:result;
//    }

    // dp: 부분 문제의 최적해가 : 큰 문제의 최적해가 된다.
    public  int coinChange2(int[] coins, int amount) {
        int [] dp = new int [amount+1];
        Arrays.fill(dp, amount + 1);
        dp[0]=0;

        for(int i =1; i <amount+1; i++) {
            for(int coin : coins) {
                if(i >=coin) {
                    dp[i]= Math.min(dp[i-coin]+1,dp[i]);
                }
            }
        }
        return dp[amount] > amount ? -1 : dp[amount];
    }
}
