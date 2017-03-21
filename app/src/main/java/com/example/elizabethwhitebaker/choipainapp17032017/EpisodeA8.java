package com.example.elizabethwhitebaker.choipainapp17032017;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

public class EpisodeA8 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_episode_a8);

        Button next = (Button)findViewById(R.id.nextButtonE8);
        Button prev = (Button)findViewById(R.id.prevButtonE8);


        next.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(EpisodeA8.this, EpisodeA8.class);
                startActivity(intent);
            }
        });
      prev.setOnClickListener(new View.OnClickListener() {
          @Override
          public void onClick(View v) {
              Intent intent = new Intent(EpisodeA8.this, EpisodeA8.class);
              startActivity(intent);
          }
      });
    }
}
