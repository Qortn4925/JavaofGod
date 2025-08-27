package javainflearn.polymorphism.ex.pay0;

public class OtherPay implements Pay{
    @Override
    public boolean pay(int amount) {
        System.out.println("OtherPay.pay , 테스트용");
        return false;
    }
}
