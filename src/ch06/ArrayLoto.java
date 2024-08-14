package ch06;

public class ArrayLoto {
    public static void main(String[] args) {
        ArrayLoto ar = new ArrayLoto();
        ar.init();
        ar.primitiveTypes();
    }
    public  void init(){
        //자료형 []  배열이름 = new 자료형[크기];
        int [] lottonubers =new int[7];
        lottonubers[0]=1;
        lottonubers[1]=2;
        lottonubers[2]=3;
        lottonubers[3]=4;
        lottonubers[4]=5;
        lottonubers[5]=6;
        lottonubers[6]=7;
    }

    //배열의 초기값 확인용
    public  void primitiveTypes(){
        byte[] by = new byte[1];
        short[] sh = new short[1];
        int [] it =new int[1];
        long[] lo = new long[1];
        float[] fl = new float[1];
        char[] ch = new char[1];
        boolean[] bo = new boolean[1];
        System.out.println("by = " + by[0]);
        System.out.println("sh = " + sh[0]);
        System.out.println("it = " + it[0]);
        System.out.println("lo = " + lo[0]);
        System.out.println("fl = " + fl[0]);
        System.out.println("ch = " + ch[0]);  // >> char의 초기값은 \u0000 으로 공백
        System.out.println("bo = " + bo[0]);
    }

}
