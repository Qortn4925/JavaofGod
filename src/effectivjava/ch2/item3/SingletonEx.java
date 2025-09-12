package effectivjava.ch2.item3;

public class SingletonEx {
    // 1번 , private 생성자로 두고  멤버변수로 접근 ( 컴파일시 하나만 생성되는게 자명해짐 )

//    public static final SingletonEx  singleton = new SingletonEx();

    // 2번 멤버변수를 private 으로 두고 , 정적 팩토리 메소드를 통한 접근
    private  static final SingletonEx singleton = new SingletonEx();

    public  static SingletonEx getInstance() { return  singleton;}


    private SingletonEx() {
    }

    private Object readResolve() {
        return  singleton;
    }

}
