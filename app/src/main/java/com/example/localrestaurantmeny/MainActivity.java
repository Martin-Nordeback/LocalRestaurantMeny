package com.example.localrestaurantmeny;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;


public class MainActivity extends AppCompatActivity {

    Button starters;
    Button mainCourse;
    Button desserts;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        starters = findViewById(R.id.buttonStarter);
        mainCourse = findViewById(R.id.buttonMainCourse);
        desserts = findViewById(R.id.buttonDessert);

        starters.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent newStarterButton = new Intent(MainActivity.this, Activity2.class);
                startActivity(newStarterButton);

            }
        });
        mainCourse.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent newMainButton = new Intent(MainActivity.this, Activity3.class);
                startActivity(newMainButton);

            }
        });
        desserts.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent newDessertButton = new Intent(MainActivity.this, Activity4.class);
                startActivity(newDessertButton);

            }
        });


    }


}

