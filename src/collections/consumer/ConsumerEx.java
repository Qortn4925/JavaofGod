package collections.consumer;

public class ConsumerEx {

    public static void main(String[] args) {

        // 람다
        CustomInterface<String> s = ()-> "hello" ;
        CustomInterface<String> s1 = ()-> "hello 2" ;

        // 익명 클래스
        CustomInterface.printStatic();
        CustomInterface<String>  customInterfaceEx1 = new CustomInterface<String>() {
            @Override
            public String myCall() {
                return "abc";
            }
        };

        // 메소드 참조
        CustomInterface<String> customInterfaceEx2 = ConsumerEx::sayB;


        String a = s.myCall();
        String a1 = s1.myCall();
        System.out.println(s);

        System.out.println("a = " + a);
        System.out.println("a1 = " + a1);

        s.printDefault();


            System.out.println(customInterfaceEx1.myCall());
            System.out.println(customInterfaceEx2.myCall());


    }

    public static String sayB () {
        return  "B";
    }
}
