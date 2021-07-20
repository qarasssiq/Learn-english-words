package sample;

import java.util.List;
import java.util.Random;

public class Words_new {

    private String word;
    private String translate;

    Words_new(String word, String translate) {
        this.word = word;
        this.translate = translate;
    }

    public String getWord() {
        return this.word;
    }

    public String getTranslate() {
        return this.translate;
    }

    public static Words_new getRandomWord(List<Words_new> givenList) {
        Random rand = new Random();
        return givenList.get(rand.nextInt(givenList.size()));
    }
}
