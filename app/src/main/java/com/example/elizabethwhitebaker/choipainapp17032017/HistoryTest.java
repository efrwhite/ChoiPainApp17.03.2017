package com.example.elizabethwhitebaker.choipainapp17032017;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class HistoryTest extends AppCompatActivity {
    TextView test;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_history_test);

        test = (TextView)findViewById(R.id.textView3a9);
        Button goback = (Button)findViewById(R.id.button3a9);
        test.setText(StartPage.CollectionData);
        goback.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                test.setText(StartPage.CollectionData);

                Intent intent = new Intent(HistoryTest.this, StartPage.class);
                startActivity(intent);
            }
        });



    }
}
