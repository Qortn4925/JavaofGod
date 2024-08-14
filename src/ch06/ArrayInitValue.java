package ch06;

public class ArrayInitValue {
    public static void main(String[] args) {
        ArrayInitValue ai = new ArrayInitValue();
            ai.referenceTypes();

        System.out.println("String 객체 "+new String[0]);   //[ >> 객체라는 뜻 L은 참조형 자바의 데이터형.배열고유번호

    }
    public void referenceTypes(){
        //참조 자료형의 초기값 확인 >>  null


        String [] St = new String[2];
        St[0]= "aaaaaa";

        ArrayInitValue[] ar =new ArrayInitValue[2];
        ar[0] = new ArrayInitValue();
        System.out.println("St  "+St[0]);
        System.out.println("ar  "+ar[0]);     //>> 객체 출력 결과가 저모양인 이유는 참조 자료형은

        
//       toString()이라는 메소드를 오버라이딩 해야하는데  안해줘서 기본 형태임  파일위치.타입이름@ 고유번호
        
    }
}
