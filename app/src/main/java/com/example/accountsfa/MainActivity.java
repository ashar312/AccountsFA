package com.example.accountsfa;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    Button[] AllButtons;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        AllButtons = new Button[4];
        AllButtons[0] = findViewById(R.id.CreateAc);
        AllButtons[1] = findViewById(R.id.CreateEntry);
        AllButtons[2] = findViewById(R.id.GJ);
        AllButtons[3] = findViewById(R.id.Trialbalance);

        AllButtons[0].setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(MainActivity.this,CreateAccount.class));
            }
        });
        AllButtons[1].setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(MainActivity.this,CreateEntry.class));
            }
        });
        AllButtons[2].setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(MainActivity.this,generaljournel.class));
            }
        });
        AllButtons[3].setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

            }
        });




    }
}
