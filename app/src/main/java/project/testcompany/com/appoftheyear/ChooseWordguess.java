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
    private TextView correctView;
    private TextView wrongView;
    private TextView wordguessBox;
    private EditText wordguessInput;
    private String gametype;
    private int correct = 0;
    private int wrong = 0;
    private int random = new Random().nextInt(7);

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.wordguess);

        wordguessBox = findViewById(R.id.descriptionBox);
        wordguessInput = findViewById(R.id.wordguessInput);
        correctView = findViewById(R.id.correctView);
        wrongView = findViewById(R.id.wrongView);

        gametype = getIntent().getStringExtra("Game");

        SetWordguess(gametype);

        Next();
        Back();
    }

    public void SetWordguess(String game){
        if(game.equals("runescape")){
            wordguessBox.setText(wordlist.GetRunescapeDisc(random));
            wordguess = new Wordguess(wordlist.GetRunescape(random));
        }
        if(game.equals("overwatch")){
            wordguessBox.setText(wordlist.GetOverwatchDisc(random));
            wordguess = new Wordguess(wordlist.GetOverwatch(random));
        }
        if(game.equals("csgo")){
            wordguessBox.setText(wordlist.GetCsgoDisc(random));
            wordguess = new Wordguess(wordlist.GetCsgo(random));
        }

        correctView.setText(String.valueOf(correct));
        wrongView.setText(String.valueOf(wrong));
        wordguessInput.setText("");
    }

    public void Next(){
        Button nextButton = findViewById(R.id.nextBtn);
        nextButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String antwoord = wordguessInput.getText().toString();
                if(wordguess.Check(antwoord)){
                    Toast toast = Toast.makeText(getApplicationContext(), "Correct", Toast.LENGTH_SHORT); toast.show();
                    correct++;
                }else{
                    Toast toast = Toast.makeText(getApplicationContext(), "Wrong", Toast.LENGTH_SHORT); toast.show();
                    wrong++;
                }
                random = new Random().nextInt(7);
                SetWordguess(gametype);
            }
        });
    }

    public void Back(){
        Button startButton = findViewById(R.id.backBtn);
        startButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(ChooseWordguess.this, menu.class));
            }
        });
    }
}
