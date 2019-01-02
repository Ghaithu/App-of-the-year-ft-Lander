package project.testcompany.com.appoftheyear.Classes;

public class Wordguess {

    private String woord;
    private String[] woordRiddle;

    public Wordguess(String woord) {
        this.woord = woord;
    }

    public String getWoord() { return woord; }

    public boolean Check(String juistWoord){
        boolean isJuist = false;
        if(woord == juistWoord){
            isJuist = true;
        }
        return isJuist;
    }

}
