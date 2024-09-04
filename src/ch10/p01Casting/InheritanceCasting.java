package ch10.p01Casting;

public class InheritanceCasting {
    public static void main(String[] args) {

        InheritanceCasting in =new InheritanceCasting();
        in.objectCasting();

    }

    private void objectCasting() {
        ParentCasting pa = new ParentCasting();
        ChildCasting ca = new ChildCasting();

        ParentCasting pa2 = ca;
        ChildCasting ca2 =(ChildCasting) pa;
    }
}
