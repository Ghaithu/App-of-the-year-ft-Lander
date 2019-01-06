package project.testcompany.com.appoftheyear;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class menu extends AppCompatActivity {


    private String mode;
    private String game;
    private TextView modetext;
    private TextView gametext;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.mainmenu);

        modetext = findViewById(R.id.SelectedMode);
        gametext = findViewById(R.id.SelectedGame);

        PlayGame(mode);
        ChooseMode(mode);
        ChooseGame(mode);
    }

    public void PlayGame(String d){
        this.mode = d;
        Button startButton = findViewById(R.id.play);
        startButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(mode == null || game == null){
                    Toast toast = Toast.makeText(getApplicationContext(), "Please Select a mode and game", Toast.LENGTH_SHORT); toast.show();
                }else{
                    if(mode.equals("anagram")){
                        Intent intent = new Intent(menu.this, ChooseAnagram.class);
                        intent.putExtra("Game", game);
                        startActivity(intent);
                    }
                    if(mode.equals("wordguess")){
                        Intent intent = new Intent(menu.this, ChooseWordguess.class);
                        intent.putExtra("Game", game);
                        startActivity(intent);
                    }
                    if(mode.equals("hangman")){
                        Intent intent = new Intent(menu.this, ChooseHangman.class);
                        intent.putExtra("Game", game);
                        startActivity(intent);
                    }
                }
            }
        });
    }

    public void ChooseMode(String d){
        Button startButton = findViewById(R.id.mode);
        startButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(menu.this, ChooseMode.class);
                startActivityForResult(i, 1);
            }
        });
    }

    public void ChooseGame(String d){
        Button startButton = findViewById(R.id.game);
        startButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(menu.this, ChooseGame.class);
                startActivityForResult(i, 1);
            }
        });
    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
        if (requestCode == 1) {
            if(resultCode == RESULT_OK){
                mode = data.getStringExtra("Mode");
                modetext.setText("" + mode);
            }
            if (resultCode == RESULT_FIRST_USER) {
                game = data.getStringExtra("Game");
                gametext.setText("" + game);
            }
        }
    }
}

