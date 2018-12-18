package project.testcompany.com.appoftheyear;

import java.util.Random;

public class Anagram {
    private String woord;
    private String anagramwoord;

    public Anagram(String woord) {
        this.woord = woord;
    }

    public String getWoord() { return woord; }

    public String getAnagramwoord() {
        return anagramwoord;
    }

    public String GenerateAnagram(){
        for(int i = 0; i < woord.length(); i++){
            int rand = new Random().nextInt(woord.length());
            anagramwoord.concat(woord.substring(rand));
        }
        return anagramwoord;
    }
}
