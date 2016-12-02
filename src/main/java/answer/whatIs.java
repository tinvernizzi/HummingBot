package main.java.answer;

import main.java.wikiQuery.wikiQuery;
import twitter4j.JSONException;

import java.io.IOException;

public class whatIs implements Answer {
    private String word;
    private wikiQuery wiki;

    public whatIs() {
        wiki = new wikiQuery();
    }

    public boolean matchesWith(String query) {
        if (query.matches("what is(.*)")
                || query.matches("the fuck is(.*)")
                || query.matches("tell me about(.*)")) {
            word = query;
            return true;
        }
        return false;
    }

    public String getAnswer() throws IOException, JSONException {
        if (word.equals("what is")) {
            return "Uh, it seems you forgot the end of your sentence :)";
        }
        word = word.split("what is")[1].replaceAll("\\s", "");
        if (word.toLowerCase().equals("love")) {
            return "❤ Don't hurt me ❤";
        }
        String answer = wiki.makeAQuery(word);
        return answer;
    }
}