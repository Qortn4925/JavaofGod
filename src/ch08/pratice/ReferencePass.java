package ch08.pratice;

public class ReferencePass {
    public static void main(String[] args) {
        ReferencePass rf =new ReferencePass();
        rf.callPassByValue();
    }

    public void callPassByValue(){
        int a =10;
        String b = "b";
        System.out.println("before passbyvalue");
        System.out.println("a = " + a);
        System.out.println("b = " + b);

        passByValue(a,b);
        
        
        
        
        
        System.out.println("after passByValue");
        System.out.println("a = " + a);
        System.out.println("b = " + b);

    }
    public void passByValue(int a , String b){
        a=20;
        b = "z"; 
        // 위 b 코드는 b = new String("z") 코드와 같아서 , z를 기억하는 메모리주소를 새로 b에 넣어준거임
        System.out.println("in pass");
        System.out.println("a = " + a);
        System.out.println("b = " + b);

    }

}
