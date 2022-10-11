package com.example.localrestaurantmeny;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

//Maincourse page
public class Activity3 extends AppCompatActivity {

    Button home;
    Button starters;
    Button mainCourse;
    Button desserts;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.maincours);
        home = findViewById(R.id.homeButton);
        starters = findViewById(R.id.buttonStarter);
        mainCourse = findViewById(R.id.buttonMainCourse);
        desserts = findViewById(R.id.buttonDessert);

        home.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent newHomeButton = new Intent(Activity3.this, MainActivity.class);
                startActivity(newHomeButton);

            }
        });
        starters.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent newStarterButton = new Intent(Activity3.this, Activity2.class);
                startActivity(newStarterButton);

            }
        });

        desserts.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent newDessertButton = new Intent(Activity3.this, Activity4.class);
                startActivity(newDessertButton);

            }
        });
    }
}