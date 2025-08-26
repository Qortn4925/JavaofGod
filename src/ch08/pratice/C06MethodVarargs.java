package ch08.pratice;

public class C06MethodVarargs {

    public static void main(String[] args) {
        C06MethodVarargs var = new C06MethodVarargs();
        var.calculateNumbersWithArray(new int[]{1, 2, 3, 4, 5});
        var.calculateNumbers(1, 2, 3, 4, 5);
    }

    public void calculateNumbersWithArray(int[] number) {
    }

    //int ... 으로 입력하면  int 형 배열을 입력받을거로 알아서 인식  ,
    // ... 방식은 마지막
    public void calculateNumbers(int...numbers){
        int total =0;
        for (int number:numbers){
            total+=number;
        }
        System.out.println("Total ="+total);
    }
}
