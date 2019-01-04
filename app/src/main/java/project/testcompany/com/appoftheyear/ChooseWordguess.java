package project.testcompany.com.appoftheyear;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import java.util.Random;

import project.testcompany.com.appoftheyear.Classes.Anagram;
import project.testcompany.com.appoftheyear.Classes.Wordguess;
import project.testcompany.com.appoftheyear.Classes.Wordlist;

public class ChooseWordguess extends AppCompatActivity {

    private Wordlist wordlist = new Wordlist();
    private Wordguess wordguess;
    private TextView wordguessBox;
    private EditText wordguessInput;
    private int random = new Random().nextInt(7);

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.wordguess);

        wordguessBox = findViewById(R.id.descriptionBox);
        wordguessInput = findViewById(R.id.wordguessInput);

        String gametype = getIntent().getStringExtra("Game");

        if(gametype.equals("runescape")){
            wordguessBox.setText(wordlist.GetRunescapeDisc(random));
            wordguess = new Wordguess(wordlist.GetRunescape(random));
        }
        if(gametype.equals("overwatch")){
            wordguessBox.setText(wordlist.GetOverwatchDisc(random));
            wordguess = new Wordguess(wordlist.GetOverwatch(random));
        }
        if(gametype.equals("csgo")){
            wordguessBox.setText(wordlist.GetCsgoDisc(random));
            wordguess = new Wordguess(wordlist.GetCsgo(random));
        }

        Next(wordguessInput.getText().toString());
    }

    public void Next(final String antwoord){
        Button nextButton = findViewById(R.id.nextBtn);
        nextButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(wordguess.Check(antwoord)){
                    Toast toast = Toast.makeText(getApplicationContext(), "Correct", Toast.LENGTH_SHORT); toast.show();
                }else{
                    Toast toast = Toast.makeText(getApplicationContext(), "Wrong", Toast.LENGTH_SHORT); toast.show();
                }
            }
        });
    }
}
