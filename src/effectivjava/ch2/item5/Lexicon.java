package effectivjava.ch2.item5;

import java.util.List;

public interface Lexicon {

    public boolean contains(String word) ;

    public List<String> suggestions(String type) ;

}
