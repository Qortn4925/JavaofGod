package javainflearn.polymorphism.ex.sender;

public class FaceBookSender implements Sender {


    @Override
    public void sendMessage(String message) {
        System.out.println("FaceBookSender.sendMessage");
        System.out.println("message = " + message);
    }
}
