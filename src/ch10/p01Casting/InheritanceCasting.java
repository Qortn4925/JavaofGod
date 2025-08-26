package ch10.p01Casting;

public class InheritanceCasting {
    public static void main(String[] args) {

        InheritanceCasting in =new InheritanceCasting();
        in.objectCasting();

    }

    private void objectCasting() {
        ParentCasting pa = new ParentCasting();
        ChildCasting ca = new ChildCasting();

        // 오류 발생
//        ParentCasting pa2 = ca;
//        ChildCasting ca2 =(ChildCasting) pa;

        //이건 오류 안남 ,  생성시 부터  자식 객체를 받고 있던거라서
//        ParentCasting pa2 = ca;
//        ChildCasting ca2 =(ChildCasting) pa2;
    }
    public  void objectCasint2(){
        ChildCasting ca = new ChildCasting();
        ParentCasting pa = ca;
        ChildCasting c2 = (ChildCasting) pa;
    }
    public void objectCastArray(){
        ParentCasting[] parent = new ParentCasting[3];
        parent[0]=new ChildCasting();
        parent[1] = new ParentCasting();
        parent[2] = new ChildCasting();
    }
}
