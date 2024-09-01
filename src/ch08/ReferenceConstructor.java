package ch08;

public class ReferenceConstructor {

    public static void main(String[] args) {
        ReferenceConstructor ref =new ReferenceConstructor();

    }


    public void makeMemberObject(){
        MemberDTO dto1 = new MemberDTO();
        MemberDTO dto2 = new MemberDTO("Sangmin");
        MemberDTO dto3 = new MemberDTO("Sangmin","010-433-222");
        MemberDTO dto4 = new MemberDTO("Sangmin","010-433-222","aa@naver.com");
    }
}
