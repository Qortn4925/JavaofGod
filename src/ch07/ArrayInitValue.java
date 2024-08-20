package ch07;

public class ArrayInitValue {
    public static void main(String[] args) {
        ArrayInitValue ar = new ArrayInitValue();
        ar.primitivTypes();
    }

    public void primitivTypes() {

        byte[] bar = new byte[1];
        short[] sar = new short[1];
        int[] inarr = new int[1];
        long[] longar = new long[1];
        float[] flar = new float[1];
        double[] doar = new double[1];
        char[] charr = new char[1];
        boolean[] bolar = new boolean[1];   // boolean 의 기본값은 false

        System.out.println("bar = " + bar[0]);
        System.out.println("sar = " + sar[0]);
        System.out.println("inarr = " + inarr[0]);
        System.out.println("longar = " + longar[0]);
        System.out.println("flar = " + flar[0]);
        System.out.println("doar = " + doar[0]);
        System.out.println("charr = " + charr[0]);
        System.out.println("bolar = " + bolar[0]);
    }
}
