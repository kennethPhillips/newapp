package myprojects.com.worldwargun.ui;

import android.content.Intent;
import android.graphics.drawable.Drawable;
import android.support.v4.content.ContextCompat;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import org.w3c.dom.Text;

import myprojects.com.worldwargun.R;
import myprojects.com.worldwargun.model.Game;
import myprojects.com.worldwargun.model.Page;

public class GameActivity extends AppCompatActivity {

    private Game game;
    private ImageView gameImageView;
    private TextView gameTextView;
    private Button submitButton;
    private TextView pointsTextView;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_game);

        gameImageView = (ImageView) findViewById(R.id.gameImageView);
        gameTextView = (TextView) findViewById(R.id.gameTextView);
        pointsTextView = (TextView) findViewById(R.id.pointsTextView);
        submitButton = (Button) findViewById(R.id.submitButton);
        game = new Game();
        loadPage(0);
        checkAnswer(0);
    }

    int points = 0;


    private void loadPage(final int pageNumber) {


        final Page page = game.getPage(pageNumber);

        if (page.isFinalPage()) {
            startSubmit();
        }

        Drawable image = ContextCompat.getDrawable(this, page.getImageId());
        gameImageView.setImageDrawable(image);


        String pageText = getString(page.getTextId());
        gameTextView.setText(pageText);

        final int nextPage = page.getNextPage();


        submitButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                loadPage(nextPage);
                checkAnswer(nextPage);
            }
        });

    }

    private void checkAnswer(int pageNumber) {
        final Page page = game.getPage(pageNumber);
        String gameAnswer = page.getAnswer();
        Toast.makeText(this, "CODE REACHED checkAnswer", Toast.LENGTH_SHORT).show();
        String gameEditText = ((EditText) findViewById(R.id.gameSquare)).getText().toString();
        if (gameEditText.equals(gameAnswer)) {
            points++;
        }
        Toast.makeText(this, gameEditText + " " + gameAnswer, Toast.LENGTH_SHORT).show();
        String pointsText = String.format("%1$s", points);
        pointsTextView.setText(pointsText);
    }

    private void startSubmit() {
        Intent submitIntent = new Intent(this, SubmitActivity.class);
        startActivity(submitIntent);
    }

    public String getPoints() {
        return String.valueOf(points);
    }

}
