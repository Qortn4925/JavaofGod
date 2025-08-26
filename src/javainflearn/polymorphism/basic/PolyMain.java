package javainflearn.polymorphism.basic;

public class PolyMain {

    public static void main(String[] args) {

        System.out.println("Parent - Parent");
        Parent parent = new Parent();
        parent.parntMetohd();

        // 자식 변수가 자식 인스턴스
        System.out.println("Child - Child");
        Child child = new Child();
        child.childMethod();


        System.out.println("부모- 자식 ");
        Parent poly = new Child();
        poly.parntMetohd();
//        poly.childMethod  << 실행 불가.
        System.out.println("자식- 부모");
//        Child poly = new Parent();
//        poly.parntMetohd();


        System.out.println(" 다운 캐스팅");
        Parent parentPoly = new Child(); // 업캐스팅
        System.out.println(parentPoly);
        Child childPoly = (Child) parentPoly; // 다운캐스팅 안전
        System.out.println(childPoly);
        childPoly.childMethod(); // 가능
        //상속 은 기본적으로 확장의 개념이다,  자식의 경우 부모보다 더 많은 것을 가지고 있으니, 할 수 없는게 당연..
        //  하지만0 부모에 자식을 담아봤자 자식의 기능은 사용하지 못한다. 그렇다면 이것은 왜 존재하는걸까>?
        // 1. 업 캐스팅 한 객체를, 다시 다운 캐스팅 해서 자식의 메소드에 접근하는것은 가능하지만
        //  2.부모 a = new 부모 () ;  를 다운 캐스팅해서 사용하는것은 불가능하다 , 자식의 경우 생성과 동시에 부모를 먼저 생성하고 정보를 넘겨받기에 상관없지만
        // 2. 번의 경우는 부모의 인스턴스만 생성되기에 자식의 인스턴스에 접근할 수가 없다.
    }
}
