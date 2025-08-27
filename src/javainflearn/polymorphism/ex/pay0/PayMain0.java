package javainflearn.polymorphism.ex.pay0;

import java.util.Scanner;

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

        method(payService);

    }

    static void method(PayService payService) {
        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.println("결제수단을 입력하세요 (exit 입력 시 종료): ");
            String payOptions = sc.nextLine();

            if (payOptions.equalsIgnoreCase("exit")) {
                break;
            }

            System.out.println("가격을 입력해주세요: ");
            int insertAmount = Integer.parseInt(sc.nextLine());

            payService.processPay(payOptions, insertAmount);
        }

        System.out.println("종료합니다.");
    }
}
