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
    private TextView strText;
    private TextView dexText;
    private TextView agiText;
    private TextView endText;
    private TextView intText;
    private TextView wisText;

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
        int strRoll = rollDie(3);
        strText.setText(String.valueOf(strRoll));

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

    public int rollDie (int times)
    {
        int dieSum = 0;
        for (int i = 1; i < times+1; i++)
        {
            dieSum += rand.nextInt(7);
        }
        return dieSum;
    }
}