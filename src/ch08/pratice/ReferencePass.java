package ch08.pratice;

public class ReferencePass {
    public static void main(String[] args) {
        ReferencePass rf = new ReferencePass();
        rf.callPassByReference();
    }

    //중각 생략
    public  void callPassByReference(){
        C03MemberDTO meber = new C03MemberDTO("Sangmin");
        System.out.println("befor passByReference");
        System.out.println("member.name="+meber.name);
        
        passByReference(meber);
        System.out.println("after Passby");
        //메소드에 받은 이후에도 값에 영향을 끼침 > 인스턴스를 받아서 기억하고 있다~
        System.out.println("meber.name = " + meber.name);
    }

    private void passByReference(C03MemberDTO meber) {
        meber.name = "Sunchonn";
        System.out.println("in passBy");
        System.out.println("meber.name  = " + meber.name);
    }

}
