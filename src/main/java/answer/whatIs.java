package main.java.answer;

import main.java.wikiQuery.wikiQuery;

/**
 * Created by user on 02/12/2016.
 */
public class whatIs implements Answer {

    public whatIs() {
        wikiQuery wiki = new wikiQuery();
    }

    public boolean matchesWith(String query) {
        if (query.matches("(.*)what is(.*)")
                ||query.matches("(.*)the fuck is(.*)")
                ||query.matches("(.*)tell me about(.*)"))
        {
            return true;
        }
        return false;
    }

    public String getAnswer(String query) {
        String answer = wikiQuery.makeAQuery(query);
    }
}
