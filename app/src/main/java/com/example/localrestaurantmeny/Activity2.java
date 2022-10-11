package com.example.localrestaurantmeny;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

//Starters page
public class Activity2 extends AppCompatActivity {

    Button home;
    Button starters;
    Button mainCourse;
    Button desserts;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.starters);
        starters = findViewById(R.id.buttonStarter);
        mainCourse = findViewById(R.id.buttonMainCourse);
        home = findViewById(R.id.homeButton);
        desserts = findViewById(R.id.buttonDessert);

        home.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent newHomeButton = new Intent(Activity2.this, MainActivity.class);
                startActivity(newHomeButton);

            }
        });
        mainCourse.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent newMainButton = new Intent(Activity2.this, Activity3.class);
                startActivity(newMainButton);

            }
        });

        desserts.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent newDessertButton = new Intent(Activity2.this, Activity4.class);
                startActivity(newDessertButton);

            }
        });
    }
}