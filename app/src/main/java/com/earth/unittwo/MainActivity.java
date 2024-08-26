package com.earth.unittwo;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {
    private EditText editTextName, editTextAddress, editTextEmail, editTextMobile;
    private Button submitButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });

        editTextName = findViewById(R.id.edit_text_name);
        editTextAddress = findViewById(R.id.edit_text_address);
        editTextEmail = findViewById(R.id.edit_text_email);
        editTextMobile = findViewById(R.id.edit_text_mobile);
        submitButton = findViewById(R.id.submit_button);

        submitButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Get user inputs
                String name = editTextName.getText().toString();
                String address = editTextAddress.getText().toString();
                String email = editTextEmail.getText().toString();
                String mobile = editTextMobile.getText().toString();

                // Create an Intent to start the DisplayActivity
                Intent intent = new Intent(MainActivity.this, displayActivity.class);
                // Put user data into the Intent
                intent.putExtra("name", name);
                intent.putExtra("address", address);
                intent.putExtra("email", email);
                intent.putExtra("mobile", mobile);
                // Start DisplayActivity
                startActivity(intent);
            }
        });

    }



}