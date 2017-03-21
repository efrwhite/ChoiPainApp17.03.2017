package com.example.elizabethwhitebaker.choipainapp17032017;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.Spinner;

public class EpisodeA1 extends AppCompatActivity {
public static String PainLevel = "";
    public static String TypeOfPain = "";

    Button btn1;
    Button btn2;
    Button btn3;
    Button btn4;
    Button btn5;
    Button btn6;
    Button btn7;
    Button btn8;
    Button btn9;
    Button btn10;
    Button next;
    Button prev;
    Spinner spn1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_episode_a1);
    btn1 = (Button)findViewById(R.id.button3E1);
        btn2 = (Button)findViewById(R.id.button4E1);
        btn3 = (Button)findViewById(R.id.button5E1);
        btn4 = (Button)findViewById(R.id.button6E1);
        btn5 = (Button)findViewById(R.id.button7E1);
        btn6 = (Button)findViewById(R.id.button8E1);
        btn7 = (Button)findViewById(R.id.button9E1);
        btn8 = (Button)findViewById(R.id.button10E1);
        btn9 = (Button)findViewById(R.id.button14E1);
        btn10 = (Button)findViewById(R.id.button15E1);
        next = (Button)findViewById(R.id.nextButtonE1);
        prev = (Button)findViewById(R.id.prevButtonE1);
        spn1 = (Spinner)findViewById(R.id.spinner3E1);


        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                EpisodeA1.PainLevel = "1";
            }
        });

        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                EpisodeA1.PainLevel = "2";
            }
        });

        btn3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                EpisodeA1.PainLevel = "3";
            }
        });
        btn4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                EpisodeA1.PainLevel = "4";
            }
        });
        btn5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                EpisodeA1.PainLevel = "5";
            }
        });
        btn6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                EpisodeA1.PainLevel = "6";
            }
        });
        btn7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                EpisodeA1.PainLevel = "7";
            }
        });
        btn8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                EpisodeA1.PainLevel = "8";
            }
        });
        btn9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                EpisodeA1.PainLevel = "9";
            }
        });
        btn10.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                EpisodeA1.PainLevel = "10";
            }
        });
        next.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                spn1.getSelectedItem().toString();

                Intent intent = new Intent(EpisodeA1.this, EpisodeA2.class);
                startActivity(intent);
            }
        });
        prev.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(EpisodeA1.this, StartPage.class);
                startActivity(intent);
            }
        });





    }
}
