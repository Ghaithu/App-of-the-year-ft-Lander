package project.testcompany.com.appoftheyear.Classes;

import java.util.Random;

public class Wordlist {
    public String[] runescape = {"Karambwan","Edgeville", "Spider","Dragon","Lumbridge", "Varrock","Goblin"};
    public String[] overwatch = {"Tracer", "Bastion", "Ashe", "Pulsebomb", "Genji", "Hanzo", "Dorado"};
    public String[] csgo = {"Dust2", "Nuke", "Glock", "Cache", "UMP", "AWP", "Bomb"};
    public String[] runescapeDisc = {"Spiky fish","Town on the edge", "8 legs", "breaths fire","place where death takes you", "the place delrith lurks","noobs kill this"};
    public String[] overwatchDisc = {"Ever get that feeling of déjà vu?","Beep boop","Bob","a powerful ultimate that you stick to enemies","Cyborg Ninja","Genji's older brother","Mayan temple"};
    public String[] csgoDisc = {"Best map", "Tower", "starter gun", "slavic", "best SMG", "sniper", "plant it"};

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
