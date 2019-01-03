package project.testcompany.com.appoftheyear;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class ChooseGame extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.choose_game);
    }

    public void PlayAnagram(){
        Button startButton = findViewById(R.id.optionAnagram);
        startButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(ChooseGame.this, menu.class));
                //getIntent().putExtra("Game", "anagram");
            }
        });
    }

    public void PlayWordguess(){
        Button startButton = findViewById(R.id.optionAnagram);
        startButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(ChooseGame.this, menu.class));
                //getIntent().putExtra("Game", "wordguess");
            }
        });
    }

    public void PlayHangman(){
        Button startButton = findViewById(R.id.optionAnagram);
        startButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(ChooseGame.this, menu.class));
                //getIntent().putExtra("Game", "hangman");
            }
        });
    }
}
