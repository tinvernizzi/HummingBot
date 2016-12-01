package main.java.answer;

import java.util.regex.*;

/**
 * Created by Zaki on 01/12/2016.
 */
public class Abilities {
    private static Pattern pattern;
    private static Matcher matcher;

    public boolean matchesWith(String query) {
        query.toLowerCase();

        pattern = Pattern.compile("(what are you capable of) (what are your features) (what can you do)");
        matcher = pattern.matcher(query);
        while(matcher.find()) {
            return true;
        }
        return false;
    }

    public String getAnswer() {
        return "Well, I can answer your questions, or tell you some jokes (believe me, they are amazing), I can present myself or give you some help with git.";
    }
}
