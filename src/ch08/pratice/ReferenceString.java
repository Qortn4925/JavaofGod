package ch08.pratice;

public class ReferenceString {

    //디폴트 생성자 수동으로 만들어주면 밑에 주석 사용 가능
    ReferenceString(){

    }
    
    ReferenceString(String arg){
        
    }

    public static void main(String[] args) {
        // 인자를 가지는 생성자를 만들었기 때문에 . 기본 생성자인(argu값이 없는) 가 만들어지지 않아서 밑에 코드 오류
//        ReferenceString rs = new ReferenceString();

        ReferenceString rs = new ReferenceString("a");

    }
}
