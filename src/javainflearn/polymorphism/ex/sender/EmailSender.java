package javainflearn.polymorphism.ex.sender;

public class EmailSender implements Sender{
    @Override
    public void sendMessage(String message) {
        System.out.println("EmailSender.sendMessage");
        System.out.println("message = " + message);
    }
}
