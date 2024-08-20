package ch07;

public class ArrayPrint {
    public static void main(String[] args) {
        // 배열을 초기화 하지 않고 사용하면 배열의 정보가 나옴
        // [L : >  [ 해당 객체가 배열이라는 의미  L > 참조 배열이라는뜻
        //java.lang.String > 어떤 타입의 배열ㅇ니가
        //해당 배열의 고유 번호
        ArrayPrint ap = new ArrayPrint();
        ap.printString();
    }
    public  void printString(){
        System.out.println("new String[0] = " + new String[0]);   
        System.out.println(" ap= " +new ArrayPrint[0]);
    }
}
