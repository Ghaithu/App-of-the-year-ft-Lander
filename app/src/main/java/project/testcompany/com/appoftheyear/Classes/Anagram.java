package project.testcompany.com.appoftheyear.Classes;

import java.util.Random;

public class Anagram {
    private String woord;
    private String anagramwoord;

    public Anagram(String woord) {
        this.woord = woord;
    }

    public String GenerateAnagram() {
        if (woord != null  &&  !"".equals(woord)) {
            char a[] = woord.toCharArray();
            for (int i = 0; i < a.length; i++) {
                int j = new Random().nextInt(a.length);
                char tmp = a[i];
                a[i] = a[j];
                a[j] = tmp;
            }
            return new String(a);
        }
        return woord;
    }

    public boolean Check(String antwoord){
        boolean isCorrect = false;
        if (this.woord.equals(antwoord)){
            isCorrect = true;
        }
        return isCorrect;
    }
}
