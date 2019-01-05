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

        if(woord.contains(letter)){
            isJuist = true;
            teller = woord.indexOf(letter);
        }else{
            isJuist = false;
        }

        /*for(int i = 0; i < woord.length(); i++){
            if(letter.equals(woord.substring(i))){
                woordOplossing[i] = letter;
                teller = i;
                isJuist = true;
            }
        }*/

        return isJuist;
    }

}
