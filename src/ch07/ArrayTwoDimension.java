package ch07;

public class ArrayTwoDimension {
    public static void main(String[] args) {
        ArrayTwoDimension at = new ArrayTwoDimension();
        at.twoDimensionArray();
    }
    public void twoDimensionArray() {
        //2 차원 배열의 초기화 방법 두 가지
        //2 차원 배열의 [0]는 배열이다 
        //2 차원 배열의 [a][1]> 이게 자료형 ㅇㅇ
        int[][] twod;
    twod=new int[2][3];  // [a][b] a가로 b 세로
        //twod = new int[1][] > 이렇게 1차원 쪽만 크기 지정해도 됨
        int[][] arr2 = new int[1][3];
        // twod = new int[2][] 로 초기선언을 했다면  2차원 배열은 어떻게 선언하나 ??
        // twod[0] = new int[3];
        // twod[1] = new int[2]   > 2차원 배열을 초기에 선언 하지 않으면  2차원 배열의 크기를 다르게 할수 있음

        int[][] twodim = {{1, 2, 3}, {4, 5, 6}};

        for (int i =0; i<3; i++){
            System.out.print(twodim[0][i]);
        }


    }
}
