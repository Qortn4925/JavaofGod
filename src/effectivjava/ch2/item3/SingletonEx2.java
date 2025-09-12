package effectivjava.ch2.item3;

public enum SingletonEx2 {
    INSTANCE;

    public void leaveTheBuilding() {
        System.out.println("기다려 금방 나갈겡");
    }

    private int count =0;

    public void addOne() {
        count++;
    }

    public int getCount() {
        return count;
    }


    public static void main(String[] args) {
        SingletonEx2 singletonEx2 = SingletonEx2.INSTANCE;
        SingletonEx2 singletonEx1 = SingletonEx2.INSTANCE;

        singletonEx1.addOne();
        singletonEx2.addOne();

        System.out.println("singletonEx1 = " + singletonEx1.getCount());

        singletonEx2.leaveTheBuilding();
        if(singletonEx1.getCount()==singletonEx2.getCount()){
            System.out.println("일치");
        }
    }

}
