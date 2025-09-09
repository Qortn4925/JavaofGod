package effectivjava.ch2.item1;

public class User {

    private String name;
    private int age;

    public User(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public static User ofName(String name) {
        return new User(name, 0);
    }

    public static User ofNameAndAge(String name, int age) {
        return new User(name, age);
    }
}

     class UserFactoryExample{
        public static void main(String[] args) {
            User ofName = User.ofName("이름");

            User ofNameAndAge = User.ofNameAndAge("이름1", 2);

            System.out.println("ofNameAndAge = " + ofNameAndAge);
            System.out.println("ofName = " + ofName);
        }
    }

