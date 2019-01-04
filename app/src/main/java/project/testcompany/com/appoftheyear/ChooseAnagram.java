package project.testcompany.com.appoftheyear;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

import java.util.Random;

import project.testcompany.com.appoftheyear.Classes.Anagram;
import project.testcompany.com.appoftheyear.Classes.Wordlist;

public class ChooseAnagram extends AppCompatActivity {

    private Wordlist wordlist = new Wordlist();
    private Anagram anagram;
    private TextView anagrambox;
    private TextView anagramAnswer;
    private int random = new Random().nextInt(7);

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.anagram);

        anagrambox = findViewById(R.id.anagramBox);
        anagramAnswer = findViewById(R.id.anagramInput);

        String gametype = getIntent().getStringExtra("Game");

        if(gametype.equals("runescape")){
            anagrambox.setText(wordlist.GetRunescapeDisc(random));
        }

    }
}
