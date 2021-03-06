package main.java.wikiQuery;

import twitter4j.JSONArray;
import twitter4j.JSONException;
import twitter4j.JSONObject;

import java.io.IOException;
import java.net.URL;
import java.util.Scanner;

/**
 * Created by user on 02/12/2016.
 */
public class wikiQuery {

    public wikiQuery() {
    }

    ;

    public String makeAQuery(String nameOfArticle) throws IOException, JSONException {
        String out = new Scanner(new URL("https://en.wikipedia.org/w/api.php?action=opensearch&format=json&search=" + nameOfArticle).openStream(), "UTF-8").useDelimiter("\\A").next();
        JSONArray JSONquery = new JSONArray(out);

        JSONObject jo = new JSONObject();
        // populate the array
        jo.put("wikiQuery", JSONquery);

        if (jo.getJSONArray("wikiQuery").get(1).toString().equals("[]") || jo.getJSONArray("wikiQuery").get(2).toString().equals("[\"\"]")) {
            return "Huuuh... I don't know what you are talking about";
        }
        String result = jo.getJSONArray("wikiQuery").get(2).toString().replaceAll("\",\"", "\n");
        result = result.replaceAll("\\[\"", "").replaceAll("\"\\]","");
        if (result.length() > 250)
            result = result.substring(0, 250) + "..." + "\nhttps://en.wikipedia.org/wiki/" + nameOfArticle;
        else
            result += "\nFor more info:" + "https://en.wikipedia.org/wiki/"+nameOfArticle;

        return result;
    }
}
