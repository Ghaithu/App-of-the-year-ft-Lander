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
                Intent intent = new Intent();
                intent.putExtra("Mode", "anagram");
                setResult(RESULT_OK, intent);
                finish();
            }
        });
    }

    public void PlayWordguess(){
        Button startButton = findViewById(R.id.optionWordguess);
        startButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent();
                intent.putExtra("Mode", "wordguess");
                setResult(RESULT_OK, intent);
                finish();
            }
        });
    }

    public void PlayHangman(){
        Button startButton = findViewById(R.id.optionHangman);
        startButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent();
                intent.putExtra("Mode", "hangman");
                setResult(RESULT_OK, intent);
                finish();
            }
        });
    }
}