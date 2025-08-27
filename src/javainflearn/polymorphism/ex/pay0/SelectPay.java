package javainflearn.polymorphism.ex.pay0;

public class SelectPay {


    public static Pay select(String option) {
        if(option.equals("kakao")){
            return new KakaoPay();
        }else if (option.equals("naver")){
            return  new NaverPay();

        }else if (option.equals("other")){
            return  new OtherPay();
        }
        else {
            return  new DefaultPay();
        }
    }
}
