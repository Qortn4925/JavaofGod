package effectivjava.ch2.item9;

import java.io.*;


 class SuppressedDemo2 {
    public static void main(String[] args) {
        try (MyResource r = new MyResource()) {
            r.doSomething();
        } catch (IOException e) {
            System.out.println("Main 예외: " + e.getMessage());
            for (Throwable t : e.getSuppressed()) {
                System.out.println("Suppressed: " + t.getMessage());
            }
        }
    }
}

class MyResource implements AutoCloseable {
    @Override
    public void close() throws IOException {
        throw new IOException("close 예외 발생");
    }

    public void doSomething() throws IOException {
        throw new IOException("try 블록 예외 발생");
    }
}

