package com.example.localrestaurantmeny;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

//Dessert page
public class Activity4 extends AppCompatActivity {

    Button home;
    Button starters;
    Button mainCourse;
    Button desserts;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.desserts);
        home = findViewById(R.id.homeButton);
        starters = findViewById(R.id.buttonStarter);
        mainCourse = findViewById(R.id.buttonMainCourse);
        desserts = findViewById(R.id.buttonDessert);

        home.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent newHomeButton = new Intent(Activity4.this, MainActivity.class);
                startActivity(newHomeButton);

            }
        });
        starters.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent newStarterButton = new Intent(Activity4.this, Activity2.class);
                startActivity(newStarterButton);
            }
        });
        mainCourse.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent newMainButton = new Intent(Activity4.this, Activity3.class);
                startActivity(newMainButton);
            }
        });

    }

}