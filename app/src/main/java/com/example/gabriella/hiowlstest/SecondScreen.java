package com.example.gabriella.hiowlstest;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class SecondScreen extends AppCompatActivity {


    public Button mainM;
    public Button scannerC;

    public void buttonM(){

        mainM= findViewById(R.id.mainM);
        mainM.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent menuM = new Intent(SecondScreen.this, MainActivity.class);

                startActivity(menuM);
            }
        });
    }

    public void buttonS(){

        scannerC= findViewById(R.id.scanner);
        scannerC.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent menuS = new Intent(SecondScreen.this, CamApp.class);

                startActivity(menuS);
            }
        });
    }
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second_screen);
        buttonM();
        buttonS();
    }




}
