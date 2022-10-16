package com.magers.increasingbutton;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }


    public void onFlipScreen(View view) {
        Intent flipScreenIntent = new Intent(this, SecondActivity.class);
        this.startActivity(flipScreenIntent);

        Button button = findViewById(R.id.btn_1);
        String buttonValue = button.getText().toString();
        Integer buttonCount = Integer.parseInt(buttonValue);
        Integer buttonIncrease = Increment.doubleMyValue(buttonCount);
        button.setText(buttonIncrease.toString());



        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {


            }
        });
    }
}
