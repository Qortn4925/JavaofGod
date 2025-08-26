package ch10.inheritance;

public class InheritancePrint {
    public static void main(String[] args) {

        Child child =new Child();
        // 부모 생성자의 디폴트 코드를 따로 작성하지 않아도 > 알아서 컴파일러가 생성
        // 하지만 원래 만들어 두었던  프린트 함수는 사라져서  나옴

        child.printName();
    }
}
