package effectivjava.ch2.item6;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Item6Quiz {

    private static final DateTimeFormatter FORMATTER = DateTimeFormatter.ofPattern("yyyy/MM/dd");

    public static String formatDate(LocalDate date) {
        return date.format(FORMATTER); // 매번 같은 객체를 재사용
    }

    public static void main(String[] args) {
        for(int i =0; i<5; i++) {
            System.out.println(formatDate(LocalDate.now()));
        }
    }
}
