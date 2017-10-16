package myprojects.com.worldwargun.ui;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

import org.w3c.dom.Text;

import myprojects.com.worldwargun.R;
import myprojects.com.worldwargun.model.Page;


public class SubmitActivity extends AppCompatActivity {

    public TextView finalScoreTextView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_submit);

        GameActivity game = new GameActivity();
        finalScoreTextView = (TextView) findViewById(R.id.scoreTextView);
        String text = String.format("Score: %1$s", game.getPoints());
        finalScoreTextView.setText((text));
    }
}
