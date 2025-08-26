package ch10.p01Casting;

public class Example {
    public static void main(String[] args) {

        ParentCasting pa = new ParentCasting();
        ChildCasting ca = new ChildCasting();

        // 부모 = 자식 자동 형변환
        ParentCasting parentCasting = new ChildCasting();

        // 이건 인스턴스가 자식꺼라서  자식의 오버라이딩 된 메소드를 출력하지만 , 자식만 가지고 있는 메소드는 사용 몬함
        parentCasting.printName();
        ca.printAge();
        ca.printName();

        // 이건 X >  자동으로 안되고 강제로 해야함 자식은 부모꺼 받아서 추가 가능 > 하지만 부모는 자식꺼 못 받아오니까
        // 크기가 더 작은 관계라 볼수 있음   a is b  라 a=b 는 가능하지만  b= a  ㄴㄴ
//        ChildCasting childCasting = new ParentCasting();
//        ChildCasting childCasting =(ChildCasting) new ParentCasting();

    }
}
