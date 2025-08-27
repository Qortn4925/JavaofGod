package javainflearn.polymorphism.ex.pay0;

public class NaverPay implements  Pay{

    @Override
    public boolean pay(int amount) {
        System.out.println("NaverPay.pay");
        System.out.println(amount+"원 결제를 시도합니다.");
        return true;
    }
}
