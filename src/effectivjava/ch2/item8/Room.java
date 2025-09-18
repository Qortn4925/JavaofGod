package effectivjava.ch2.item8;

import java.lang.ref.Cleaner;

public class Room implements AutoCloseable{
    private  static final Cleaner cleaner = Cleaner.create();
    private final Cleaner.Cleanable cleanable;
    private final State state;

    private static class State implements  Runnable {
        int numJunkPiles;

        State(int numJunkPiles) {
            this.numJunkPiles= numJunkPiles;
        }
        
        @Override
        public void run() {
            System.out.println("방 청소");
            numJunkPiles=0;
        }
    }

    public Room(int numJunkPiles) {
        state = new State(numJunkPiles);
        cleanable = cleaner.register(this,state);
    }

    @Override
    public void close()  {
        cleanable.clean();
    }
}
