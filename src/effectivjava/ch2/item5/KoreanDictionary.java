package effectivjava.ch2.item5;

import java.util.List;

public class KoreanDictionary implements Lexicon {

     private List<String> wordList = List.of("안녕", "세상", "자바");

    @Override
    public boolean contains(String word) {

      return   wordList.contains(word);
    }

    @Override
    public List<String> suggestions(String type) {
        return wordList;
    }
}
