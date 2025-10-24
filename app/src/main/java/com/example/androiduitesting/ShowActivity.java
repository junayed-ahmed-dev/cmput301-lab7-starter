package com.example.androiduitesting;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;

public class ShowActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_show);

        TextView cityNameText = findViewById(R.id.show_city_name);
        Button backButton = findViewById(R.id.back_button);

        // Get the city name from intent
        String cityName = getIntent().getStringExtra("CITY_NAME");
        cityNameText.setText(cityName);

        // Back button to return to MainActivity
        backButton.setOnClickListener(v -> finish());
    }
}
