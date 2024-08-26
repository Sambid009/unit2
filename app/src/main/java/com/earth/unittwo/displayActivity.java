package com.earth.unittwo;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class displayActivity extends AppCompatActivity {
    private TextView textViewName, textViewAddress, textViewEmail, textViewMobile;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_display);

        textViewName = findViewById(R.id.text_view_name);
        textViewAddress = findViewById(R.id.text_view_address);
        textViewEmail = findViewById(R.id.text_view_email);
        textViewMobile = findViewById(R.id.text_view_mobile);

        // Get data from Intent
        Intent intent = getIntent();
        String name = intent.getStringExtra("name");
        String address = intent.getStringExtra("address");
        String email = intent.getStringExtra("email");
        String mobile = intent.getStringExtra("mobile");

        // Set data to TextViews
        textViewName.setText("Name: " + name);
        textViewAddress.setText("Address: " + address);
        textViewEmail.setText("Email: " + email);
        textViewMobile.setText("Mobile Number: " + mobile);
    }
}