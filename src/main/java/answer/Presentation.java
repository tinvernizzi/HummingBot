package main.java.answer;

import java.util.regex.*;

/**
 * Created by Zaki on 01/12/2016.
 */
public class Presentation {
    private static Pattern pattern;
    private static Matcher matcher;

    public boolean matchesWith(String query) {
        query.toLowerCase();

        pattern = Pattern.compile("(hi) (hey) (who are you) (present yourself) (your name)");
        matcher = pattern.matcher(query);
        while(matcher.find()) {
            return true;
        }
        return false;
    }

    public String getAnswer() {
        return "Hi, I'm HummingBot, created during #nuitinfo, at your service.";
    }
}
