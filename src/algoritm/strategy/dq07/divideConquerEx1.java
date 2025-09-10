package algoritm.strategy.dq07;

public class divideConquerEx1 {


   public static int fastSum(int n){

        // 기저 사례
        if(n==1) return 1;

        if(n%2==1) return fastSum(n-1) +n;

        return 2*fastSum(n/2) + (n/2)*(n/2) ;
    }


    public static void main(String[] args) {

        int i = fastSum(5);
        int j = fastSum(6);
        System.out.println("i = " + i);
        System.out.println("j = " + j);

    }

}
