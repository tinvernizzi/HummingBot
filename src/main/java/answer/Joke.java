package main.java.answer;

/**
 * Created by user on 01/12/2016.
 */

public class Joke implements Answer {

    public boolean matchesWith(String query) {
        if (query.matches("^C'est quoi *"))
            return true;
        return false;
    }

    public String getAnswer() {
        return "Toc toc.\nQui est là ?\n*Pause de 10 secondes*\nC'est Java !";
    }
}
