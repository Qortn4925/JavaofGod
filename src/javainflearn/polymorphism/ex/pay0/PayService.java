package javainflearn.polymorphism.ex.pay0;

public class PayService {

    private  Pay pay;
    private SelectPay selectPay;
    public void processPay(String option, int amount) {


        boolean result;
        System.out.println("결제를 시작합니다 ");
        System.out.println("option = " + option + "amount = " + amount);

//        if(option.equals("kakao")){
//            KakaoPay kakaoPay = new KakaoPay();
//            result = kakaoPay.pay(amount);
//
//        }else if (option.equals("naver")){
//            NaverPay naverPay = new NaverPay();
//            result = naverPay.pay(amount);
//        }else {
//            System.out.println(" 결제 수단이 없습니다.");
//            result =false;
//        }
        pay = SelectPay.select(option);
        result  = pay.pay(amount);

        if( result) {
            System.out.println("결제가 성공");
        }else {
            System.out.println("결제가 실패 했습니다.");
        }
    }
}
