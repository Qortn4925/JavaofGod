package effectivjava.ch2.item5;

import java.util.List;

public class EnglishDictionary implements Lexicon {
    List<String> wordList = List.of("hello", "java", "world");
    @Override
    public boolean contains(String word) {

        return wordList.contains(word);
    }


    @Override
    public List<String> suggestions(String type) {

        return wordList;
    }
}
