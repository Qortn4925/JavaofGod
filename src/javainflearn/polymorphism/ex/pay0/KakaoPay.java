package javainflearn.polymorphism.ex.pay0;

public class KakaoPay implements  Pay{
    @Override
    public boolean pay(int amount) {
        System.out.println("KakaoPay.pay");
        System.out.println("amount = " + amount +"원 만큼 결제를 시도합니다.");
        return  true;
    }
}
