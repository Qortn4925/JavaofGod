package collections.consumer;

public class ConsumerEx {

    public static void main(String[] args) {

        CustomInterface<String> s = ()-> "hello" ;
        CustomInterface<String> s1 = ()-> "hello 2" ;

        String a = s.myCall();
        String a1 = s1.myCall();
        System.out.println(s);

        System.out.println("a = " + a);
        System.out.println("a1 = " + a1);

        s.printDefault();
            CustomInterface.printStatic();
    }
}
