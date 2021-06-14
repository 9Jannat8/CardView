package com.example.cardview;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    private CardView schoolCardView, hospitalCardView, airportCardView, restaurantCardView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        schoolCardView = findViewById(R.id.schoolCardViewId);
        hospitalCardView = findViewById(R.id.hospitalCardViewId);
        airportCardView = findViewById(R.id.airportCardViewId);
        restaurantCardView = findViewById(R.id.restaurantCardViewId);

        schoolCardView.setOnClickListener(this);
        hospitalCardView.setOnClickListener(this);
        airportCardView.setOnClickListener(this);
        restaurantCardView.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {

        if(v.getId() == R.id.schoolCardViewId)
        {
            Intent intent = new Intent(MainActivity.this, SchoolActivity.class);
            startActivity(intent);
        }

        else if(v.getId() == R.id.hospitalCardViewId)
        {
            Intent intent = new Intent(MainActivity.this, HospitalActivity.class);
            startActivity(intent);
        }

        else if(v.getId() == R.id.airportCardViewId)
        {
            Intent intent = new Intent(MainActivity.this, AirportActivity.class);
            startActivity(intent);
        }

        else if(v.getId() == R.id.restaurantCardViewId)
        {
            Intent intent = new Intent(MainActivity.this, RestaurantActivity.class);
            startActivity(intent);
        }
    }
}