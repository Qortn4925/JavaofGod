package effectivjava.ch2.item5;

import java.util.List;

public class SpellCheckerEx {

    public static void main(String[] args) {

        SpellChecker spellChecker = new SpellChecker(new EnglishDictionary());

        spellChecker.isValid("hello");
        spellChecker.isValid("hell");
        List<String> abc = spellChecker.suggestions("abc");

        for (String s : abc) {
            System.out.println("s = " + s);
        }


        SpellChecker spellChecker2 = new SpellChecker(new KoreanDictionary());

        spellChecker2.isValid("안녕");
        spellChecker2.isValid("hell");
        List<String> abc1 = spellChecker2.suggestions("abc");

        for (String s : abc1) {
            System.out.println("s = " + s);
        }

    }
}
