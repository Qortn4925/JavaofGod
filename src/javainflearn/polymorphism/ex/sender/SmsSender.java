package javainflearn.polymorphism.ex.sender;

public class SmsSender implements Sender {

    @Override
    public void sendMessage(String message) {
        System.out.println("SmsSender.sendMessage");
        System.out.println("message = " + message);
    }
}
