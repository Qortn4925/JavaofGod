package ch07;

public class ArrayNewFor {
    public static void main(String[] args) {
        ArrayNewFor ar = new ArrayNewFor();
        ar.newFor();
    }

    public  void newFor(){
        int[] oneDim = new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        for (int data: oneDim){  // 배열값들을 변수로 이용해서 쓰는거넹, 파이썬에 있는거랑 비슷한듯 ?
            //배열의 0번째 인덱스 부터 ~ 끝까지)
            System.out.println(data);
        }
        int[][] twdDim = {{1, 2, 3}, {4, 5, 6}};

        // 2차원 배열을 사용할때는  첫 [] 는 값이 아닌 배열이기에 데이텨형을 배열로 해서 받아왔다
        // 그렇다면 dimArray: dpsms [1,2,3]  이라는 twoDim[0]의 배열 요소들이 들어간다
        // 그 밑에는  위에와 같이 배열의 첫 요소부터 ~ 끝 까지
        for (int[]dimAraay:twdDim) {
            for(int data:dimAraay){
                System.out.println(data);
            }
        }
    }

}
