package effectivjava.ch3.item10;

public class ColorPoint extends Point {

    private final Color color;

    public ColorPoint(int x, int y,Color color) {
        super(x, y);
        this.color=color;
    }

    @Override
    public boolean equals(Object o) {
        if(!(o instanceof ColorPoint)) {
            return false;
        }
        System.out.println("실행");
        return super.equals(o) && ((ColorPoint)o).color ==color;
    }
}
