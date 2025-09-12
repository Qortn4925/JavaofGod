package effectivjava.ch2.itme5;

import java.util.List;

public interface Lexicon {

    public boolean contains(String word) ;

    public List<String> suggestions(String type) ;

}
