package com.example.elizabethwhitebaker.choipainapp17032017;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class HistoryA8 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_history_a8);

        Button goNext = (Button)findViewById(R.id.button3a8);

        goNext.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                StartPage.CollectionData = StartPage.fName + "\n" +StartPage.lName + "\n" +StartPage.gender + "\n" +StartPage.ethnicity + "\n" +StartPage.CancerDetected + "\n" +StartPage.OtherConditions + "\n" +StartPage.PastPainTreatment + "\n" +StartPage.CurrentPainTreatment + "\n" +StartPage.PastUseDrugs + "\n" +StartPage.CurrentUseDrugs + "\n" +StartPage.AbusePersonalHistory + "\n" +StartPage.AbuseFamilyHistory + "\n" +StartPage.AbuseSexualHistory + "\n" +StartPage.emailid + "\n" +StartPage.DOB + "\n" +StartPage.PainTreatGoal + "\n" +StartPage.PainTreatPref;

                try {
                    FileOutputStream fileOutputStream = openFileOutput("ChoiData", MODE_PRIVATE);

                    fileOutputStream.write(StartPage.CollectionData.getBytes());

                    fileOutputStream.close();
                } catch (FileNotFoundException e) {
                    e.printStackTrace();
                } catch (IOException e) {
                    e.printStackTrace();
                }
                Intent intent = new Intent(HistoryA8.this, HistoryTest.class);
                startActivity(intent);
            }
        });



    }
}
