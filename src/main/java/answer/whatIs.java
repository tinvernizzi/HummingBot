package main.java.answer;

import main.java.wikiQuery.wikiQuery;

/**
 * Created by user on 02/12/2016.
 */
public class whatIs implements Answer {
    private String word;

    public whatIs() {
        wikiQuery wiki = new wikiQuery();
    }

    public boolean matchesWith(String query) {
        if (query.matches("what is(.*)")
                ||query.matches("the fuck is(.*)")
                ||query.matches("tell me about(.*)"))
        {
            word = query;
            return true;
        }
        return false;
    }

    public String getAnswer() {
        String answer = wikiQuery.makeAQuery(word);
    }
}
