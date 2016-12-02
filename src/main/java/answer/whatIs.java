package main.java.answer;

import main.java.wikiQuery.wikiQuery;
import twitter4j.JSONException;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by user on 02/12/2016.
 */
public class whatIs implements Answer {
    private String word;
    private wikiQuery wiki;
    private List<String> listOfMatch = new ArrayList<String>();

    public whatIs() {
        wiki = new wikiQuery();
        listOfMatch.add("what is");
        listOfMatch.add("the fuck is");
        listOfMatch.add("tell me about");
    }

    public boolean matchesWith(String query) {
        for (String str : listOfMatch) {
            if (query.matches(str + "(.*)")) {
                word = query;
                return true;
            }
        }
        return false;
    }

    public String getAnswer() throws IOException, JSONException {
        //traitement sur le bousin
        for (String str : listOfMatch) {
            if (word.equals(str)) {
                return "Uh, it seems you forgot the end of your sentence \\uD83D\\uDE23";
            }
            if(word.contains(str)){
                word = word.split(str)[1].replaceAll("\\s", "");
            }
            if (str.equals("what is") && word.toLowerCase().equals("love")) {
                return "Baby, don't hurt me"+"\nhttps://www.youtube.com/watch?v=tojicre_Qe8";
            }
        }
        String answer = wiki.makeAQuery(word);
        return answer;
    }
}
