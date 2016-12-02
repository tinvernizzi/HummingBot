package main.java.answer;

/**
 * Created by Zaki on 01/12/2016.
 */
public class Abilities implements Answer {
    public boolean matchesWith(String query) {
        if (query.matches("(.*)what can you do(.*)")||query.matches("(.*)what are you capable of(.*)")||query.matches("(.*)what are your features(.*)"))
        {
            return true;//true
        }
        return false;
    }

    public String getAnswer() {
        return "Well, I can answer your questions, or tell you some jokes (believe me, they are amazing \uD83D\uDE06), I can present myself or give you some help with git or anything else really \uD83D\uDE0A And guess what? I also am a super hero who help migrants finding with #tweelp";
    }
}
