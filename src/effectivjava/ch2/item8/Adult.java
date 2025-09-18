package effectivjava.ch2.item8;

public class Adult {

    public static void main(String[] args) {
        try(Room MyRoom = new Room(7)){
            System.out.println("안ㄴ녕~!~");

        }


        Room room1 = new Room(7);
        Throwable primartExc = null;
        try {
            System.out.println(" 안녕");
        }catch (Throwable t) {
            primartExc = t;
            throw t;
        }finally {
            if(room1 !=null) {
                if (primartExc != null) {
                    // 본문에서 이미 예외
                    // close에서 던진 예외는 원래 예외의 suppressed로 붙인다

                    try {
                        room1.close();
                    }catch (Throwable closeExc){
                        primartExc.addSuppressed(closeExc);
                    }
                }else {
                    room1.close();
                }
            }
        }
    }
}
