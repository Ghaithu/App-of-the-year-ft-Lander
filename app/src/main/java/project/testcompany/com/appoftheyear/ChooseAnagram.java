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
import project.testcompany.com.appoftheyear.Classes.Wordlist;

public class ChooseAnagram extends AppCompatActivity {

    private Wordlist wordlist = new Wordlist();
    private Anagram anagram;
    private TextView anagrambox;
    private TextView correctView;
    private TextView wrongView;
    private EditText anagramAnswer;
    private int random = new Random().nextInt(7);
    private int correct = 0;
    private int wrong = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.anagram);

        anagrambox = findViewById(R.id.anagramBox);
        anagramAnswer = findViewById(R.id.anagramInput);
        correctView = findViewById(R.id.correctView);
        wrongView = findViewById(R.id.wrongView);

        String gametype = getIntent().getStringExtra("Game");

        SetAnagram(gametype);
        Next(gametype);
        Back();
    }

    public void Next(final String game){
        Button nextButton = findViewById(R.id.nextBtn);
        nextButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String antwoord = anagramAnswer.getText().toString();
                if(anagram.Check(antwoord)){
                    Toast toast = Toast.makeText(getApplicationContext(), "Correct", Toast.LENGTH_SHORT); toast.show();
                    correct++;
                }else{
                    Toast toast = Toast.makeText(getApplicationContext(), "Wrong", Toast.LENGTH_SHORT); toast.show();
                    wrong++;
                }
                random = new Random().nextInt(7);
                SetAnagram(game);
            }
        });
    }
    public void SetAnagram(String game){
        if(game.equals("runescape")){
            anagram = new Anagram(wordlist.GetRunescape(random));
        }
        if(game.equals("overwatch")){
            anagram = new Anagram(wordlist.GetOverwatch(random));
        }
        if(game.equals("csgo")){
            anagram = new Anagram(wordlist.GetCsgo(random));
        }
        anagrambox.setText(anagram.GenerateAnagram());
        correctView.setText(String.valueOf(correct));
        wrongView.setText(String.valueOf(wrong));
    }

    public void Back(){
        Button startButton = findViewById(R.id.backBtn);
        startButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(ChooseAnagram.this, menu.class));
            }
        });
    }
}
