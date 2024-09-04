package ch10.p01Casting;

public class ChildCasting extends  ParentCasting{
    public ChildCasting() {
    }

    public ChildCasting(String name) {
        super(name);
    }
    public  void printName(){
        System.out.println("printName()-child");

    }

    public void printAge(){
        System.out.println("printAge-18 month");
    }
}
