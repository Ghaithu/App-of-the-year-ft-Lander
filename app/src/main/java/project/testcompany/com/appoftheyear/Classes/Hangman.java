package project.testcompany.com.appoftheyear;

import java.util.Random;

public class Hangman {

    private String woord;
    private String[] woordOplossing;

    public Hangman(String woord) {
        this.woord = woord;
    }

    public String getWoord() { return woord; }
    public String[] getOplossing() { return woordOplossing; }

    public boolean CheckLetter(String letter){
        boolean isJuist = false;
        for(int i = 0; i < woord.length(); i++){
            if(letter == woord.substring(i)){
                woordOplossing[i] = letter;
                isJuist = true;
            }
        }
        return isJuist;
    }

}
