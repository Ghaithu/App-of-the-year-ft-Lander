package project.testcompany.com.appoftheyear;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class ChooseMode extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.choose_mode);
        PlayAnagram();
        PlayHangman();
        PlayWordguess();
    }

    public void PlayAnagram(){
        Button startButton = findViewById(R.id.optionAnagram);
        startButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(ChooseMode.this, menu.class));
                getIntent().putExtra("Mode", "anagram");
            }
        });
    }

    public void PlayWordguess(){
        Button startButton = findViewById(R.id.optionWordguess);
        startButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(ChooseMode.this, menu.class));
                getIntent().putExtra("Mode", "wordguess");
            }
        });
    }

    public void PlayHangman(){
        Button startButton = findViewById(R.id.optionHangman);
        startButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(ChooseMode.this, menu.class));
                getIntent().putExtra("Mode", "hangman");
            }
        });
    }
}