package ch08.pratice;

public class C05ReferenceReturn {
    public static void main(String[] args) {
        C05ReferenceReturn rf = new C05ReferenceReturn();
        System.out.println(rf.intReturn());
        System.out.println(rf.intArrayReturn());
    }

    public  int intReturn(){
        int returnInt=0;
        return  returnInt;
    }

    public  int[] intArrayReturn(){
        int returnArray[] = new int[10];
        return  returnArray;
    }

}
