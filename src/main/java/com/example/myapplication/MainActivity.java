package com.example.myapplication;
import android.os.Bundle;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;
import android.widget.Button;
import java.util.ArrayList;
import java.util.Collections;


public class MainActivity extends AppCompatActivity {

    TextView txtFact;
    Button btnNext;

    ArrayList<String> facts = new ArrayList<>();
    int currentIndex = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        txtFact = findViewById(R.id.txtFact);
        btnNext = findViewById(R.id.btnNext);

        facts.add("Australia is wider than the Moon.");
        facts.add("Honey never spoils.");
        facts.add("Venus spins backwards.");
        facts.add("Bananas are radioactive.");
        facts.add("Octopuses have three hearts.");
        facts.add("The Eiffel Tower \"grows\" in summer.");
        facts.add("Scotland's national animal is a unicorn.");
        facts.add("Trees outnumber stars in the galaxy.");
        facts.add("A day on Venus is longer than a year.");
        facts.add("Flamingos are born grey.");

        Collections.shuffle(facts);

        txtFact.setText(facts.get(currentIndex));
        btnNext.setOnClickListener(v -> {
            currentIndex++;

            if (currentIndex < facts.size()) {
                txtFact.setText(facts.get(currentIndex));
            }
            else {
                btnNext.setEnabled(false);
                btnNext.setText("No More Facts");
            }
        });
    }
}
