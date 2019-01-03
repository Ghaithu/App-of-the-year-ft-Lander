package project.testcompany.com.appoftheyear;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class menu extends AppCompatActivity {


    private String data = "menu";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.mainmenu);

        Bundle bundle = getIntent().getExtras();
        if(bundle != null){
            String data = bundle.getString("Mode");
        }

        PlayGame(data);
        ChooseMode(data);
        ChooseGame(data);
    }

    public void PlayGame(String d){
        this.data = d;
        Button startButton = findViewById(R.id.play);
        startButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(data == "menu"){
                    startActivity(new Intent(menu.this, menu.class));
                }
                if(data == "anagram"){
                    startActivity(new Intent(menu.this, ChooseAnagram.class));
                }
                if(data == "wordguess"){
                    startActivity(new Intent(menu.this, ChooseWordguess.class));
                }
                if(data == "hangman"){
                    startActivity(new Intent(menu.this, ChooseHangman.class));
                }
            }
        });
    }

    public void ChooseMode(String d){
        Button startButton = findViewById(R.id.mode);
        startButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(menu.this, ChooseMode.class));
            }
        });
    }

    public void ChooseGame(String d){
        Button startButton = findViewById(R.id.game);
        startButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(menu.this, ChooseGame.class));
            }
        });
    }
}

