package main.java.answer;

import java.util.regex.*;

/**
 * Created by Zaki on 01/12/2016.
 */
public class Presentation {
    public boolean matchesWith(String query) {
        if (query.matches("(.*)hi(.*)")||query.matches("(.*)hey(.*)")||query.matches("(.*)who are you(.*)")||query.matches("(.*)present yourself(.*)"))
        {
            return true;
        }
        return false;
    }
    public String getAnswer() {
        return "Hi, I'm HummingBot, created during #nuitinfo, at your service.";
    }
}
