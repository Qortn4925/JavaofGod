package ch07;

public class ArrayInitialize {
    public static void main(String[] args) {
        ArrayInitialize array =new ArrayInitialize();
        array.otherInit();
        System.out.println(array.getMonth(10));
    }

    public  void otherInit(){
        // 배열 선언과 초기화를 동시에 하는 방법
        int[] lott = {5, 12, 2, 3, 25, 38, 41, 2};
        // 중괄호를 이용해 배열을 선언할떄는 한 번에 해야함 아니면 오류
        
//        int[] arr;
//        arr = {1, 2, 3, 4};
    }
    public  String getMonth(int monthInt){
        String[] month = {"1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12"};
        return month[monthInt+1];
    }
}
