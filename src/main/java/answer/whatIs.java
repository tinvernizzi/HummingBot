package main.java.answer;

import main.java.wikiQuery.wikiQuery;
import twitter4j.JSONException;

import java.io.IOException;

/**
 * Created by user on 02/12/2016.
 */
public class whatIs implements Answer {
    private String word;
    private wikiQuery wiki;

    public whatIs() {
        wiki = new wikiQuery();
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

    public String getAnswer() throws IOException, JSONException {
        //traitement sur le bousin
        word = word.split("what is")[1].replaceAll("\\s","");
        System.out.println("word = " + word);
        String answer = wiki.makeAQuery(word);
        return answer;
    }
}
