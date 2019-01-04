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
        PlayRunescape();
        PlayCsgo();
        PlayOverwatch();
    }

    public void PlayRunescape(){
        Button startButton = findViewById(R.id.optionRunescape);
        startButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent();
                intent.putExtra("Game", "runescape");
                setResult(RESULT_FIRST_USER, intent);
                finish();
            }
        });
    }

    public void PlayOverwatch(){
        Button startButton = findViewById(R.id.optionOverwatch);
        startButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent();
                intent.putExtra("Game", "overwatch");
                setResult(RESULT_FIRST_USER, intent);
                finish();
            }
        });
    }

    public void PlayCsgo(){
        Button startButton = findViewById(R.id.optionCsgo);
        startButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent();
                intent.putExtra("Game", "csgo");
                setResult(RESULT_FIRST_USER, intent);
                finish();
            }
        });
    }
}
