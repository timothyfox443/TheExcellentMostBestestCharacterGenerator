package com.example.theexcellentmostbestestcharactergenerator;

import androidx.appcompat.app.AppCompatActivity;
import java.util.Random;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity
{
    private Button btnRollEm;
    private Button btnSave;
    private TextView txtCharName;
    private TextView strText; // strength value
    private TextView dexText; // dexterity value
    private TextView agiText; // agility value
    private TextView endText; // endurance value
    private TextView intText; // intelligence value
    private TextView wisText; // wisdom value

    private Random rand;



    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        rand = new Random();


        // Buttons
        btnRollEm = findViewById(R.id.btnGenChar);
        btnSave = findViewById(R.id.btnSaveChar);

        // text boxes
        txtCharName = findViewById(R.id.pxtCharName);
        strText = findViewById(R.id.txtStrInt);
        dexText = findViewById(R.id.txtDexInt);
        agiText = findViewById(R.id.txtAgiInt);
        endText = findViewById(R.id.txtEndInt);
        intText = findViewById(R.id.txtIntInt);
        wisText = findViewById(R.id.txtWisInt);

    }


    public void onClickCharGen (android.view.View view)
    {
        int strRoll = rollDie(3); // calls rollDie to generate 3-18 value
        strText.setText(String.valueOf(strRoll)); // sends value to associated textView

        int dexRoll = rollDie(3);
        dexText.setText(String.valueOf(dexRoll));

        int agiRoll = rollDie(3);
        agiText.setText(String.valueOf(agiRoll));

        int endRoll = rollDie(3);
        endText.setText(String.valueOf(endRoll));

        int intRoll = rollDie(3);
        intText.setText(String.valueOf(intRoll));

        int wisRoll = rollDie(3);
        wisText.setText(String.valueOf(wisRoll));
    }

    public void onClickSaveChar (View view)
    {

    }

    public int rollDie (int times)  //takes in the number of times to run the for loop (roll die)
    {
        int dieSum = 0;
        for (int i = 1; i < times+1; i++)
        {
            dieSum += 1 + rand.nextInt(6); // creates a random number 0-5 and adds 1 (1-6)
                                                 // and sums the values to return to the caller

        }
        return dieSum;
    }
}