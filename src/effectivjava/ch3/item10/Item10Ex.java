package effectivjava.ch3.item10;

public class Item10Ex {
    public static void main(String[] args) {

        Point p = new Point(1, 2);
        ColorPoint cp = new ColorPoint(1, 2, Color.GREEN);
        System.out.println(p.equals(cp));

        System.out.println(cp.equals(p));
        System.out.println();

    }
}
