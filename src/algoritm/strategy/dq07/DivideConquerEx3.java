package algoritm.strategy.dq07;

import java.util.ArrayList;

public class DivideConquerEx3 {


    public static int[]  multiply(int[] a, int [] b) {


        int [] result = new int[a.length+b.length-1] ;

        for(int i =0; i<a.length; i++) {

            for(int j=0; j<b.length; j++ ) {

                result [i+j] = a[i]*b[j];
            }
        }
        // 자릿수 제거
        normalize(result);


        return  result;
    }

    public static  void normalize(int [] result) {

        for(int i=result.length; i<0; i--) {
            if(i>1) {
                result[i-1] =result[i]/10 +result[i-1];
                result[i] = result[i]%10;
            }
        }

    }

    public static void main(String[] args) {
        int [] a ={3,2,1};
        int [] b ={6,5,4};

        int [] c =multiply(a,b);

       for( int i : c) {
           System.out.print(i+"");
       }


    }
}
