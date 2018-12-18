package project.testcompany.com.appoftheyear;

import java.util.Random;

public class Wordlist {
    public String[] runescape = {"Karambwan","Bandos chestplate", "Amulet of fury","Blue dragon","Lumbridge", "Varrock","Goblin"};
    public String[] overwatch = {"Tracer", "Bastion", "Ashe", "Dragonblade", "Genji", "Blizzard World", "Dorado"};
    public String[] csgo = {"Dust2", "Nuke", "Overpass", "Cache", "UMP", "AWP", "Counter terrorist"};
    public String[] runescapeDisc = {"A friend","best melee body item", "best hybrid amulet", "found in the heroes guild dungeon","place where death takes you", "the place delrith lurks","noobs kill this"};
    public String[] overwatchDisc = {"Ever get that feeling of déjà vu?","Beep boop","Bob","Genji","Cyborg Ninja","Imaginary place","Mayan temple"};
    public String[] csgoDisc = {"Best map", "Boom", "Germany", "slav", "best SMG", "sniper", "good guys"};
    private String selectedWoord;

    public Wordlist(){

    }

    public String GetRunescape(){
        int rand = new Random().nextInt(runescape.length);
        return runescape[rand];
    }
    public String GetCsgo(){
        int rand = new Random().nextInt(csgo.length);
        return csgo[rand];
    }
    public String GetOverwatch(){
        int rand = new Random().nextInt(overwatch.length);
        return csgo[rand];
    }
}
