package ch07;

public class ArrayLength {
    public static void main(String[] args) {
        ArrayLength array =new ArrayLength();
       // array.printArrayLength();
        array.printArray();

        // 배운점  2차원 배열에서의  배열의 길이는  첫 열이고 2차원 요소는 값이다.
        // 2차원 요소의 길이를 알고 싶다면  저렇게
    }

    public  void printArrayLength(){
        int[] oneDim = new int[3];
        int[][] twoDim = new int[4][2];
        System.out.println(oneDim.length);
        System.out.println("twoDim.length = " + twoDim.length);
        System.out.println(twoDim[1].length);


    }

    public  void printArray(){
        int[][] twoDim = {{1, 2, 3}, {4, 5, 6}};
        System.out.println("twoDim.length = " + twoDim.length);
        System.out.println(twoDim[0].length);
        System.out.println("=========");

//        for (int i =0; i<2; i++){
//            for (int j =0; j<3; j++){
//                System.out.println(twoDim[i][j]);
//            }
//        }
        // 지금처럼 배열의 크기가 정해져있을떈 이렇게 작성하지만..  사실 길이를 측정해서 하는게 좋다
        // 이렇게 하면 루프가 한 번 돌 떄마다 길이를 불러와야 하므로 , 값을 저장할 변수를 이용하는게 더 좋긴 하다
        for (int i =0; i<twoDim.length; i++){
            for(int j=0; j<twoDim[i].length;j++){
                System.out.println(twoDim[i][j]);

            }
        }
    }
}
