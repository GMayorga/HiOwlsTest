package com.example.gabriella.hiowlstest;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

public class CamApp extends AppCompatActivity {

    public ImageButton pers;



    public void infoPers(){

        pers=(ImageButton) findViewById(R.id.pers);
        pers.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent person = new Intent(CamApp.this, SecondScreen.class);

                startActivity(person);
            }
        });
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cam_app);
        infoPers();
    }
}
