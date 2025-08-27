package javainflearn.polymorphism.ex.pay0;

public class PayMain0 {

    public static void main(String[] args) {
            PayService payService = new PayService();
            String payOption1 ="kakao" ;
        String payOption2 = "naver";
        int amount1 =5000;
        int amount2 = 10000;

        String payOption = "bad";
        int amount3= 150000;
        // 카카오
        payService.processPay(payOption1, amount1);

            // 네이버
        payService.processPay(payOption2, amount2);

        payService.processPay(payOption,amount3);

        payService.processPay("other",1000);

    }
}
