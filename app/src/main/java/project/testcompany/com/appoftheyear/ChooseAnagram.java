package project.testcompany.com.appoftheyear;

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
    private EditText anagramAnswer;
    private int random = new Random().nextInt(7);

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.anagram);

        anagrambox = findViewById(R.id.anagramBox);
        anagramAnswer = findViewById(R.id.anagramInput);

        String gametype = getIntent().getStringExtra("Game");

        if(gametype.equals("runescape")){
            anagram = new Anagram(wordlist.GetRunescape(random));
        }
        if(gametype.equals("overwatch")){
            anagram = new Anagram(wordlist.GetOverwatch(random));
        }
        if(gametype.equals("csgo")){
            anagram = new Anagram(wordlist.GetCsgo(random));
        }
        anagrambox.setText(anagram.GenerateAnagram());
        Next();
    }

    public void Next(){
        Button nextButton = findViewById(R.id.nextBtn);
        nextButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String antwoord = anagramAnswer.getText().toString();
                if(anagram.Check(antwoord)){
                    Toast toast = Toast.makeText(getApplicationContext(), "Correct", Toast.LENGTH_SHORT); toast.show();
                }else{
                    Toast toast = Toast.makeText(getApplicationContext(), "Wrong", Toast.LENGTH_SHORT); toast.show();
                }
            }
        });
    }
}
