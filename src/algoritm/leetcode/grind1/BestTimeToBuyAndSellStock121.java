package algoritm.leetcode.grind1;

public class BestTimeToBuyAndSellStock121 {

    // 단순 최소값, 최댓값을 구하는 문제가 아님
    // 영역의 함수값 차의 최대??
    public static int maxProfit(int[] prices) {
        int buyDay=Integer.MAX_VALUE;
        int buyIndex=0;
        int sellDay=0;
        for(int i=0; i <prices.length-1; i++) {
            if(buyDay >=prices[i]) {
                buyDay=prices[i];
                buyIndex=i;
                System.out.println("buyIndex = " + buyIndex);
                System.out.println("buyDay = " + buyDay);
            }
        }

        for(int i=buyIndex; i<prices.length; i++) {
            if(sellDay<prices[i]){
                sellDay = prices[i];
                System.out.println("sellDay = " + sellDay);
            }
        }

        if( sellDay - buyDay<0) return  0;

        return sellDay - buyDay;

    }

    public static  int maxProfit2(int[] prices) {

        int max=0;
        for(int i =0; i<prices.length-1; i++) {
            for(int j=i; j<prices.length; j++) {
                if(max<prices[j]-prices[i]){
                    max=prices[j]-prices[i];
                }
            }
        }

        return  max;
    }

    public static  int maxProfit3(int [] prices) {
        int buyIndex=0;
        int maxProfit=0;
        for(int i=0; i <prices.length; i++) {
            if(maxProfit<prices[i]-prices[buyIndex]){
                maxProfit=prices[i]-prices[buyIndex];
            }
            if(prices[buyIndex] >=prices[i]) {
                buyIndex=i;
            }
        }


        return  maxProfit ==0? 0:maxProfit;
    }

    public static void main(String[] args) {
        int[] arr = {2,4,1};

        System.out.println("arr = " + maxProfit3(arr));
    }

}
