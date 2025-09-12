package effectivjava.ch2.itme5;

import java.util.List;
import java.util.Objects;

public class SpellChecker {

    // 버전 정적 유틸리티를 잘못 사용한 예시
    /*
    private static final Lexicon dictionary = ;

    private SpellChecker() {
    }

    public static boolean isValid(String word) {

    }

    public static List<String> suggestions(String type) {
*/

    // 2 싱글톤을 잘못 사용한 예
    /*
    private final Lexicon dictionary = ;

    private SpellChecker(){}

    public static SpellChecker INSTANCE = new SpellChecker();

    public boolean isValid(){}

    public List<String> suggestions(String type) {}
*/

    private final Lexicon dictionary;

    public SpellChecker(Lexicon dictionary) {
        this.dictionary = Objects.requireNonNull(dictionary);
    }

    public  boolean isValid(String word) {

       if( dictionary.contains(word)){
           System.out.println("포함");
           return  true;
       }else {
           System.out.println("포함 x");
           return  false;
       }

    }

    public List<String> suggestions(String type) {
       return dictionary.suggestions(type);
    }
}

