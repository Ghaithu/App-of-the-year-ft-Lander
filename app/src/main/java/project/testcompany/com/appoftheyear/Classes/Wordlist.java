package project.testcompany.com.appoftheyear.Classes;

import java.util.Random;

public class Wordlist {
    public String[] runescape = {"Karambwan","Bandos chestplate", "Amulet of fury","Blue dragon","Lumbridge", "Varrock","Goblin"};
    public String[] overwatch = {"Tracer", "Bastion", "Ashe", "Dragonblade", "Genji", "Blizzard World", "Dorado"};
    public String[] csgo = {"Dust2", "Nuke", "Overpass", "Cache", "UMP", "AWP", "Counter terrorist"};
    public String[] runescapeDisc = {"A friend","best melee body item", "best hybrid amulet", "found in the heroes guild dungeon","place where death takes you", "the place delrith lurks","noobs kill this"};
    public String[] overwatchDisc = {"Ever get that feeling of déjà vu?","Beep boop","Bob","Genji","Cyborg Ninja","Imaginary place","Mayan temple"};
    public String[] csgoDisc = {"Best map", "Boom", "Germany", "slav", "best SMG", "sniper", "good guys"};

    public Wordlist(){

    }

    public String GetRunescape(int index){
        return runescape[index];
    }
    public String GetCsgo(int index){
        return csgo[index];
    }
    public String GetOverwatch(int index){
        return overwatch[index];
    }
    public String GetRunescapeDisc(int index){
        return runescapeDisc[index];
    }
    public String GetCsgoDisc(int index){
        return csgoDisc[index];
    }
    public String GetOverwatchDisc(int index){
        return overwatchDisc[index];
    }
}
