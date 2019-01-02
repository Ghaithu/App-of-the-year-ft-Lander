package project.testcompany.com.appoftheyear;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class menu extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.mainmenu);
        PlayGame();
        ChooseMode();
        ChooseGame();
    }
    public void PlayGame(){
        Button startButton = findViewById(R.id.play);
        startButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(menu.this, menu.class));
            }
        });
    }

    public void ChooseMode(){
        Button startButton = findViewById(R.id.mode);
        startButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(menu.this, ChooseGame.class));
            }
        });
    }

    public void ChooseGame(){
        Button startButton = findViewById(R.id.game);
        startButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(menu.this, ChooseMode.class));
            }
        });
    }
}

