package ch08;

public class MemberDTO {
    public String name;
    public String phone;
    public String email;

    // 생성자의 쓰임새는 ,  정보를 묶어서 보관하는거에 있다.
    // 보통의 경우 메소드의 리턴타입은 . 하나의 타입 밖에 지정해줄 수 없어
    //각각의 데이터 형에 따른 메소드를 새로 만들어서 념겨줘야 할 텐데
    // 하나의 틀로 필요한 데이터를 모두 모으는 짬통 역할을 해주면 > 한번에 메소드 만으로 필요한 정보를 관리
    // 할수 있다 .!!!
    public  MemberDTO(){

    }
    public  MemberDTO(String name){
        this.name=name;
    }
    public  MemberDTO(String name,String phone){
        this.name=name;
        this.phone=phone;
    }
    public  MemberDTO(String name,String phone ,String email){
        this.name=name;
        this.email=email;
        this.phone=phone;

    }



    public static void main(String args[]){

    }
}

