package com.example.elizabethwhitebaker.choipainapp17032017;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;

public class HistoryA4 extends AppCompatActivity {
    EditText PTG;
    EditText PTP;
    Spinner PTG1;
    Spinner PTP1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_history_a4);

        PTG = (EditText)findViewById(R.id.editText7a4);
        PTP =(EditText)findViewById(R.id.editText8a4);
        PTG1 = (Spinner)findViewById(R.id.spinnera4);
        PTP1 = (Spinner)findViewById(R.id.spinner2a4);
        Button previousButton = (Button) findViewById(R.id.prevButtonHA4);

        previousButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(HistoryA4.this, HistoryA3.class);
                startActivity(intent);

            }
        });
    }
}


