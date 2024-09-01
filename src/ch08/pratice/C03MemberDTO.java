package ch08.pratice;

public class C03MemberDTO {
    C03MemberDTO dto = new C03MemberDTO();
    public String name;
    public String phone;
    public String email;

    public C03MemberDTO(String name) {
        this.name = name;
    }

    public C03MemberDTO() {
    }

    public C03MemberDTO(String name, String phone) {
        this.name = name;
        this.phone = phone;
    }

    public C03MemberDTO(String name, String phone, String email) {
        this.name = name;
        this.phone = phone;
        this.email = email;
    }

    //접근제어지정자 , 클래스명(객체 인스턴스) , 메소드명(){} >> 메소드임 반환타입을, 객체로한거
    //객체로 반환의 장점은 ,정보 관리가 쉬워진다는거임, getter,setter로 일일히 다 받을 필요없이
    //위와 같이 객체인스턴스를  반환하면 ,한번에 정보에 다접근가능
    public C03MemberDTO getMemberDTO(){

        return  dto;

    }
}
