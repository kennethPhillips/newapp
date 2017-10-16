package myprojects.com.worldwargun.ui;

import android.content.DialogInterface;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import myprojects.com.worldwargun.R;

public class Instructions extends AppCompatActivity {

    private Button playButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_instructions);

        playButton = (Button) findViewById(R.id.instructionsPlayButton);
        playButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
              startGame();
            }
        });
    }

    private void startGame() {
        Intent playIntent = new Intent(this, GameActivity.class);
        startActivity(playIntent);
    }
}
