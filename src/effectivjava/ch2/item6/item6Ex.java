package effectivjava.ch2.item6;

public class item6Ex {
    private static long sum() {
        Long sum= 0L;

        for(long i =0; i<= Integer.MAX_VALUE; i++)
            sum+=i;
        return sum;
    }

    private static long sum2() {
        long sum= 0L;

        for(long i =0; i<= Integer.MAX_VALUE; i++)
            sum+=i;
        return sum;
    }

    public static void main(String[] args) {

        System.out.println(sum());
        // 눈에 띄게 차이남
        System.out.println(sum2());

    }
}
