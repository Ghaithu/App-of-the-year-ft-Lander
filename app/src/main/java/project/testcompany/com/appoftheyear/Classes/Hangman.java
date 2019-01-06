package project.testcompany.com.appoftheyear.Classes;

import java.util.Random;

public class Hangman {

    private String woord;
    private String[] woordOplossing;
    public int teller;

    public Hangman(String woord) {
        this.woord = woord;
    }

    public String getWoord() { return woord; }
    public String[] getOplossing() { return woordOplossing; }

    public boolean CheckLetter(String letter){
        boolean isJuist = false;

        if(letter.isEmpty()){
            isJuist = false;
        }else if (woord.contains(letter)){
            isJuist = true;
            teller = woord.indexOf(letter);
        }

        return isJuist;
    }

}
