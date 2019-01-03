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
                startActivity(new Intent(ChooseGame.this, menu.class));
                getIntent().putExtra("Game", "runescape");
            }
        });
    }

    public void PlayOverwatch(){
        Button startButton = findViewById(R.id.optionOverwatch);
        startButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(ChooseGame.this, menu.class));
                getIntent().putExtra("Game", "overwatch");
            }
        });
    }

    public void PlayCsgo(){
        Button startButton = findViewById(R.id.optionCsgo);
        startButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(ChooseGame.this, menu.class));
                getIntent().putExtra("Game", "csgo");
            }
        });
    }
}
