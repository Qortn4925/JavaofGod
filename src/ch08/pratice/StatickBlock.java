package ch08.pratice;

import javax.swing.tree.AbstractLayoutCache;

public class StatickBlock {

    public static void main(String[] args) {
        StatickBlock block = new StatickBlock();
        System.out.println(block.getData());
        System.out.println("block 생성중");
        StatickBlock block1 = new StatickBlock();
        System.out.println(block1.getData());

        System.out.println("block 생성중");

    }
    static  int data =1;
    public StatickBlock(){
        System.out.println("StatickBlock.constructor");
    }

    static {
        System.out.println("first 스태틱 블록");
        data=3;
    }

    static {
        System.out.println("두 번쩨 스태틱");
        data=5;
    }

    public static int getData() {
        return data;
    }
}
