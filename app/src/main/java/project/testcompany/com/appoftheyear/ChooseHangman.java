package project.testcompany.com.appoftheyear;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import java.util.Random;

import project.testcompany.com.appoftheyear.Classes.Anagram;
import project.testcompany.com.appoftheyear.Classes.Hangman;
import project.testcompany.com.appoftheyear.Classes.Wordlist;

public class ChooseHangman extends AppCompatActivity {

    private Hangman hangman;
    private int random = new Random().nextInt(7);
    private Wordlist wordlist;
    private EditText letterInput;
    private ImageView h1;
    private ImageView h2;
    private ImageView h3;
    private ImageView h4;
    private ImageView h5;

    private TextView t1;
    private TextView t2;
    private TextView t3;
    private TextView t4;
    private TextView t5;
    private TextView t6;
    private TextView t7;
    private TextView t8;
    private TextView t9;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.hangman);

        letterInput = findViewById(R.id.hangmanInput);
        h1 = findViewById(R.id.hangmanFirst);
        h2 = findViewById(R.id.hangmanSecond);
        h3 = findViewById(R.id.hangmanThird);
        h4 = findViewById(R.id.hangmanForth);
        h5 = findViewById(R.id.hangmanFifth);

        t1 = findViewById(R.id.Letter1);
        t2 = findViewById(R.id.Letter2);
        t3 = findViewById(R.id.Letter3);
        t4 = findViewById(R.id.Letter4);
        t5 = findViewById(R.id.Letter5);
        t6 = findViewById(R.id.Letter6);
        t7 = findViewById(R.id.Letter7);
        t8 = findViewById(R.id.Letter8);
        t9 = findViewById(R.id.Letter9);

        String gametype = getIntent().getStringExtra("Game");

        SetHangman(gametype);
        Reset();
        Back();
        Next();
    }

    public void Back(){
        Button startButton = findViewById(R.id.backBtn);
        startButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(ChooseHangman.this, menu.class));
            }
        });
    }

    public void Next(){
        Button nextButton = findViewById(R.id.nextBtn);
        nextButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String antwoord = letterInput.getText().toString();
                if(hangman.CheckLetter(antwoord)){
                    Toast toast = Toast.makeText(getApplicationContext(), "Correct", Toast.LENGTH_SHORT); toast.show();
                    setLetter(hangman.teller,antwoord);
                }else{
                    Toast toast = Toast.makeText(getApplicationContext(), "Wrong", Toast.LENGTH_SHORT); toast.show();
                }
            }
        });
    }

    public void setLetter(int l, String c){
        switch (l) {
            case 1:
                t1.setText(c);
                break;
            case 2:
                t2.setText(c);
                break;
            case 3:
                t3.setText(c);
                break;
            case 4:
                t4.setText(c);
                break;
            case 5:
                t5.setText(c);
                break;
            case 6:
                t6.setText(c);
                break;
            case 7:
                t7.setText(c);
                break;
            case 8:
                t8.setText(c);
                break;
            case 9:
                t9.setText(c);
                break;
        }
    }
    public void SetHangman(String game){
        if(game.equals("runescape")){
            hangman = new Hangman(wordlist.GetRunescape(random));
        }
        if(game.equals("overwatch")){
            hangman = new Hangman(wordlist.GetOverwatch(random));
        }
        if(game.equals("csgo")){
            hangman = new Hangman(wordlist.GetCsgo(random));
        }
    }

    public void Reset(){
        h1.setVisibility(View.INVISIBLE);
        h2.setVisibility(View.INVISIBLE);
        h3.setVisibility(View.INVISIBLE);
        h4.setVisibility(View.INVISIBLE);
        h5.setVisibility(View.INVISIBLE);
    }

    public void Correct(int letterId){

    }

    public void Wrong(int letterId){

    }
}
