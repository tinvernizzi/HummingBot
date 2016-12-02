package main.java.answer;

/**
 * Created by Zaki on 01/12/2016.
 */
public class Presentation implements Answer {
    public Presentation()
    {
    }
    public boolean matchesWith(String query) {
        if (query.matches("hi(.?)")||query.matches("(.*)hey(.*)")||query.matches("(.*)who are you(.*)")||query.matches("(.*)present yourself(.*)"))
        {
            return true;
        }
        return false;
    }

    public String getAnswer()
    {
        return "Hi, I'm HummingBot, created during #nuitinfo! \uD83D\uDE01";
    }
}
