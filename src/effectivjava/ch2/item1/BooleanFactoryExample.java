package effectivjava.ch2.item1;

public class BooleanFactoryExample {
    public static void main(String[] args) {

        // 생성자를 통한 객체 생성 (deprecated)
//        Boolean  b1 = new Boolean("true");

        Boolean b2=  Boolean.valueOf("true");
        Boolean b3 = Boolean.valueOf("true");


        System.out.println(b2 == b3);
//     같은 인스턴스 반환
        System.out.println("b2.hashCode() = " + b2.hashCode());
        System.out.println("b3.hashCode() = " + b3.hashCode());
    }
}
