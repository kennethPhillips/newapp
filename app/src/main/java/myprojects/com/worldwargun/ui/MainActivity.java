package myprojects.com.worldwargun.ui;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import myprojects.com.worldwargun.R;

public class MainActivity extends AppCompatActivity {

    private Button playButton;
    private Button leaderboardButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        playButton = (Button) findViewById(R.id.playButton);
        leaderboardButton = (Button) findViewById(R.id.leaderboardButton);


        playButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startInstructions();
            }

        });
        leaderboardButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startLeaderboard();
            }


        });
    }

    private void startInstructions() {
      Intent intent = new Intent(this, Instructions.class);
        startActivity(intent);
    }

    private void startLeaderboard() {
        Intent leadintent = new Intent(this, Leaderboard.class);
        startActivity(leadintent);
    }
}
