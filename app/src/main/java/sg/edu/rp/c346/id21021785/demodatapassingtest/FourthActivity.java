package sg.edu.rp.c346.id21021785.demodatapassingtest;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

import org.w3c.dom.Text;

public class FourthActivity extends AppCompatActivity {

    TextView tvAnswer;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fourth);

        tvAnswer = findViewById(R.id.textView3);
        Intent intentReceived = getIntent();
        double value = intentReceived.getDoubleExtra("value", 0.00);
        tvAnswer.setText("Character value received is: " + value);
    }
}